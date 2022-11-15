package homework16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
public class PersonService {
    private final List<Person> personList;

    public static List<String> AllPersonNames(List<Person> personList) {
        Stream<Person> stream = personList.stream();
        List<String> allNames = new ArrayList<>();
        personList.stream()
                .forEach(Person-> allNames.add(Person.getFirstName()+" "+ Person.getLastName()));
        return allNames;
    }

    public static List<Person> AllMajorOnes(List<Person> personList) {
        Stream<Person> stream = personList.stream();

        List<Person> allMajor = personList.stream()
                .filter(Person-> Person.getAge()>18)
                .toList();
        return allMajor;
    }

    public static List<Person> allPplLivingInOradea(List<Person> personList) {
        Stream<Person> stream = personList.stream();

        List<Person> allOradea = personList.stream()
                .filter(Person-> Person.getCity()=="Oradea")
                .toList();
        return allOradea;
    }

    public static List<Person> livingInOradeaAndCluj(List<Person> personList) {
        Stream<Person> stream = personList.stream();

        List<Person> bothCities = personList.stream()
                .filter(Person-> (Person.getCity()=="Oradea") || (Person.getCity()=="Cluj-Napoca"))
                .toList();

         return bothCities;

    }

   /* public static String capitalizeFirstLetter (String s){
               return s.substring(0,1).toUpperCase()+s.substring(1,s.length());
    }*/

    public static List<String> capitalizeFirstName (List<Person> personList) {
        Stream <Person> stream = personList.stream();

        List<String> allCapitalized= personList.stream()
                .map(Person-> Person.getFirstName().toUpperCase())
                .toList();
        return allCapitalized;
    }

    public static List<String> writeName (List<Person> personList) {
        Stream <Person> stream = personList.stream();

        List<String> allWritten= personList.stream()
                //.map(Person-> Person.getFirstName()+" "+Person.getLastName().substring(0,1)+".")
                .map(Person-> String.format("s s.", Person.getFirstName(),Person.getLastName().substring(0,1)))
                .toList();
        return allWritten;
    }

    public static List<Person> majorButNotRetired (List<Person> personList) {
        Stream <Person> stream = personList.stream();

        List<Person> majorBut = personList.stream()
                .filter(Person -> (Person.getAge()>18 && Person.getAge() <60))
                .toList();
        return majorBut;
    }

    /*public boolean firstLetterEqualsGivenChar (String s, String a) {
        return s.substring(0,1).equalsIgnoreCase(a);
    }*/

    public static List<Person> namesStartingWithA(List<Person> personList) {
        Stream<Person> stream = personList.stream();

        List<Person> names = personList.stream()
                .filter(Person-> Person.getFirstName().substring(0,1).equalsIgnoreCase("a"))
                .toList();
        return names;
    }
    public static Set<String> uniqueFirstNames (List<Person> personList) {
        Stream <Person> stream = personList.stream();

        Set<String> unique = personList.stream()
                .map(Person::getFirstName)
                .collect(Collectors.toSet());

        return unique;
    }

    public static List<Person> sortedByFirstName (List<Person> personList) {
        Stream <Person> stream = personList.stream();

        List<Person> sortedN = personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .toList();
        return sortedN;
    }

    public static List<Person> sortedByFirstNameLastAge (List<Person> personList) {
        Stream <Person> stream = personList.stream();

        List<Person> sortedN = personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName).thenComparingInt(Person::getAge))
                 .toList();
        return sortedN;
    }
}
