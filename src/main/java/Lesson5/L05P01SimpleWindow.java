package Lesson5;

import javax.swing.*;
import java.awt.*;
/**
* Class L05P01SimpleWindow extends JFrame displays simple window with text inside it.
* <br><br>
*
* Class implements two methods:
* <ul>
*     <li>1 - Constructor L05P01SimpleWindow </li>
*     <li>2 - main method </li>
* </ul>
*
* @version 17.01.2018
* @author Rafał Urbański
 */

public class L05P01SimpleWindow extends JFrame{
    /**
     * <p><br>Constructor <code>L05P01SimpleWindow()</code> allows to create an object type <code>L05P01SimpleWindow</code> .
     *      <br>Calls base <code>JFrame</code> class constructor and set title of window.
     *      <br>Makes operations assignment on variables type:<br><br></p>
     * <ul>
     *      <li><code>Container cp</code> - container allows to add and collects J - components and sets layout</li>
     *      <li><code>JLabel label</code> - component collects text data inside it</li>
     *      <li>Set window characteristics</li>
     * </ul>
     */
    private L05P01SimpleWindow() {
        super("Hello World Swing");
        Container cp = this.getContentPane();
        //Content-pane sets layout
        cp.setLayout(new BorderLayout());

        JLabel label = new JLabel("Hello World");
        cp.add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the program when the close-window button clicked
        setTitle("Hello World Swing"); // "this" JFrame sets title
        setSize(300,150); //"this" JFrame sets initial size (or pack())
        setLocationRelativeTo(null); //set the window in a central location on the screen
        setVisible(true);
    }

    /**
     * The entry main() method.
     *
     * @param args Args
     */
    public static void main( String[] args ) {
        //Run GUI codes in Event-Dispatching thread for thread-safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new L05P01SimpleWindow(); //Let the constructor do the job
            }
        });
    }
}
