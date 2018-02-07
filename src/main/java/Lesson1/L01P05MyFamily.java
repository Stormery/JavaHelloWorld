package Lesson1;
/**
* Class L01P05MyFamily displays description of family members
*<br><br>
*
* Class implements only main method:
* <ul>
*		<li>main method</li>
* </ul>
*
* @version 25.01.2018
* @author Rafał Urbański
*/
public class L01P05MyFamily {
    /**
     * The entry main() method
     * <br> Makes operation assignment on variables type: <br><br>
     *    <ul>
     *        <li><code>String firstName</code></li>
     *        <li><code>String lastName</code></li>
     *        <li><code>int age</code></li>
     *        <li><p><code>System.out.println</code> - print data in console</p></li>
     *    </ul>
     * @param args Args
     */
    static void main(String[] args) {
        String firstName;
        String lastName;
        int age;

        firstName = "Dominika";
        lastName = "Wiśniewska";
        age = 15;

        System.out.println(firstName + " " + lastName + " " + age);

        firstName = "Łucja";
        lastName = "Wiśniewska";
        age = 48;

        System.out.println(firstName + " " + lastName + " " + age);

        firstName = "Ambroży";
        lastName = "Wiśniewski";
        age = 17;

        System.out.println(firstName + " " + lastName + " " + age);

        firstName = "Sławomir";
        lastName = "Wiśniewski";
        age = 50;

        System.out.println(firstName + " " + lastName + " " + age);
    }

}
