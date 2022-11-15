package homework16;

import java.util.List;

public class MainPerson {
    public static void main(String[] args) {

        List<Person> personList = List.of(
                new Person ("Popescu", "Ion", 35, "Oradea"),
                new Person ("Spencer", "Mark", 15, "Cluj-Napoca"),
                new Person ("Pop", "Camelia", 20, "Cluj-Napoca")
        );

        PersonService pservice = new PersonService(personList);
        System.out.println(pservice.AllMajorOnes(personList));

    }
}
