/**
 * Created by ewu5588 on 10/4/2017.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getInfo() {
        return String.format("firstName: %s lastName: %s age: %d", firstName, lastName, age);
    }

}
