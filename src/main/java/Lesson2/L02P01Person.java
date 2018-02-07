package Lesson2;
/**
 * Class L02P01Person keeps variables about the description of a person
 *<br><br>
 *
 * Class implements only constructor:
 * <ul>
 *		<li>Constructor L02P01Person</li>
 * </ul>
 *
 * @version 29.01.2018
 * @author Rafał Urbański
 */
public class L02P01Person {
    String firstName;
    String lastName;
    int age;

    /**
     * Constructor L02P01Person
     * <br>Makes operation assignment on variables type:<br><br>
     * @param firstName
     * @param lastName
     * @param age
     */
    public L02P01Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     *personal_data()
     * displays information about a person
     */
    public void personal_data(){
        System.out.println(firstName + " " + lastName + " " + age);
    }

}
