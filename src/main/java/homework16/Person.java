package homework16;



public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public Person (String lastName, String firstName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
