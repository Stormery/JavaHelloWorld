package Lesson3;

/**
 * Class L03P04MultiplicationTable displays mutiplication table iterated from 1-100 and from 100-1
 * Class implements only main method
 * <ul>
 *     <li>main method</li>
 * </ul>
 * @version 31.01.2018
 * @author Rafał Urbański
 */
public class L03P04MultiplicationTable {
    /**
     * The entry main() method
     * iterates two for loops and prints multiplication result.
     * @param args Args
     */
    public static void main(String[] args){
        System.out.println("Program wyświetla tabliczkę mnożenia od 1 do 100");
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        System.out.println("Program wyświetla tabliczkę mnożenia od 100 do 1");
        for (int i=10;i>=1;i--){
            for(int j=10;j>=1;j--){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}
