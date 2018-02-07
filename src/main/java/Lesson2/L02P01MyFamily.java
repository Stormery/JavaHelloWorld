package Lesson2;
/**
 * Class L02P01MyFamily creates a L02P01Person objects from the given data and displays it.
 *<br><br>
 *
 * Class implements only main method:
 * <ul>
 *		<li>main method</li>
 * </ul>
 *
 * @version 29.01.2018
 * @author Rafał Urbański
 */
public class L02P01MyFamily {
    /**
     * The entry main() method.
     * Creates a L02P01Person objects from the given data and displays it.
     *<ul>
     *     <li><code>L02P01Person (person1, person2, person3, person4)</code> - Creates person from the given data</li>
     *     <li>Displays created person</li>
     *</ul>
     *
     * @param args Args
     */
    public static void main(String[] args){
        L02P01Person person1 = new L02P01Person("Dominika", "Wiśniewska", 15);
        L02P01Person person2 = new L02P01Person("Lucja", "Wiśniewska", 18);
        L02P01Person person3 = new L02P01Person("Ambroży", "Wiśniewski", 17);
        L02P01Person person4 = new L02P01Person("Sławoir", "Wiśniewski", 50);

        person1.personal_data();
        person2.personal_data();
        person3.personal_data();
        person4.personal_data();
    }

}
