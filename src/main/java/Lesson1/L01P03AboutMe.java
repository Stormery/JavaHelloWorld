package Lesson1;
/**
 * Class L01P03AboutMe displays description of person by using variable types
 * <br><br>
 *
 * Class implements only main method:
 * <ul>
 *     <li>main method </li>
 * </ul>
 *
 * @version 23.01.2018
 * @author Rafał Urbański
 */
public class L01P03AboutMe {
    /**
     *  The entry main() method
     * <br>Makes operation assignment on variables type:<br><br>
     * <ul>
     *              <li><code>String firstName</code></li>
     *              <li><code>String lastName</code></li>
     *              <li><code>int age</code></li>
     *              <li><code>float height</code></li>
     *              <li><code>byte yearsInJava</code></li>
     *
     *      <li><p><code>System.out.println</code> - print data in console</p></li>
     * </ul>
     * @param args Args
     */
    public static void main( String[] args ){
        String firstName = "Rafal";
        String lastName = "Urbanski";
        int age = 28;
        float height = 189.5f;
        byte yearsInJava = 2;

        System.out.format("Hello! I'm %s %s,%nI'm %d years old, and I'm %.1f cm tall. %n" +
                "I'm in JAVA %d years, and I love to study it!", firstName, lastName, age, height, yearsInJava);
    }
}
