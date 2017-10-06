import java.util.Scanner;

/**
 * Created by ewu5588 on 10/4/2017.
 */
public class PersonTester {

    public static void main(String[] args) {

        System.out.print("Enter your first name: ");
        Scanner in = new Scanner(System.in);
        String firstName = in.next();
        System.out.print("Enter your last name: ");
        String lastName = in.next();
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        Person person = new Person(firstName, lastName, age);
        System.out.println(person.getInfo());

    }

}
