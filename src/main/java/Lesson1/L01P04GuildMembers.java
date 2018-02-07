package Lesson1;
/**
 * Class L01P04GuildMembers displays description of clan members by using variable types
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
public class L01P04GuildMembers {
    /**
     *  The entry main() method
     * <br>Makes operation assignment on variables type:<br><br>
     * <ul>
     *              <li><code>String xMemberName</code></li>
     *              <li><code>String xMemberClass</code></li>
     *              <li><code>int xMemberLvl</code></li>
     *
     *              <li><code>String yMemberName</code></li>
     *              <li><code>String yMemberClass</code></li>
     *              <li><code>int yMemberLvl</code></li>
     *
     *              <li><code>String zMemberName</code></li>
     *              <li><code>String zMemberClass</code></li>
     *              <li><code>int zMemberLvl</code></li>
     *
     *      <li><p><code>System.out.println</code> - print data in console</p></li>
     * </ul>
     * @param args Args
     */
    public static void main( String[] args ) {
        //Clan Members

        System.out.println("Member Nickname : " + "StillSoul" + "\tClass: " + "Destroyer" + " \tLVL: " + "6");
        System.out.println("Member Nickname : " + "Verties" + "\tClass: " + "Cleric" + " \t\tLVL: " + "74");
        System.out.println("Member Nickname : " + "Sylo" + "\t\tClass: " + "Tank" + " \t\tLVL: " + "79");
        System.out.println("Member Nickname : " + "Vatras" + " \tClass: " + "Warshmit" + " \tLVL: " + "73");
        System.out.println("Member Nickname : " + "Sensor" + " \tClass: " + "Mage" + " \t\tLVL: " + "68");

        String xMemberName = "Stormery";
        String xMemberClass = "Wizard";
        int xMemberLvl = 76;

        String yMemberName = "Bastic";
        String yMemberClass = "Warlord";
        int yMemberLvl = 70;

        String zMemberName = "Seta";
        String zMemberClass = "Warrior";
        int zMemberLvl = 64;


        //Print data in console
        System.out.println("Member Nickname : " + xMemberName + " \tClass: " + xMemberClass + " \t\tLVL: " + xMemberLvl);
        System.out.println("Member Nickname : " + yMemberName + " \tClass: " + yMemberClass + " \t\tLVL: " + yMemberLvl);
        System.out.println("Member Nickname : " + zMemberName + " \t\tClass: " + zMemberClass + " \t\tLVL: " + zMemberLvl);
    }


}
