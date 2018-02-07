package Lesson1;
/**
 * Class L01P02MyVariables displays different types of variables using in JAVA.
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
public class L01P02MyVariables {
    /**
     *  The entry main() method
     * <br>Makes operation assignment on variables type:<br><br>
     * <ul>
     *              <li><code>String nickname</code></li>
     *              <li><code>byte characterLvl</code></li>
     *              <li><code>int healthPoints</code></li>
     *              <li><code>short manaPoints</code></li>
     *              <li><code>float strenghtPower</code></li>
     *              <li><code>double defensePower</code></li>
     *              <li><code>char rank</code></li>
     *              <li><code>boolean isStillAlive</code></li>
     *
     *      <li><p><code>System.out.println</code> - print data in console</p></li>
     * </ul>
     * @param args Args
     */
    public static void main(String[] args){
        String nickname = "Stormery";

        byte characterLvl = 45;
        int healthPoints = 4320;
        short manaPoints = 2100;
        long experience = 54203200L;
        float strenghtPower = 25.5f;
        double defensePower = 15.5;
        char rank = 'S';
        boolean isStillAlive = true;

        System.out.println("Nickname: " + nickname);
        System.out.format("Lvl: %d:%d xp%n",characterLvl,experience);
        System.out.format("HP: %d and MP: %d%n",healthPoints,manaPoints);
        System.out.format("Attack power: %.3f%n",strenghtPower);
        System.out.println("Defense: " + defensePower);
        System.out.println("Class rank: " + rank);
        System.out.println("Is still alive: " + isStillAlive);

    }
}
