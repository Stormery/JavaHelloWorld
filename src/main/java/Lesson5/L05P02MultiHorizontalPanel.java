package Lesson5;

import javax.swing.*;
import java.awt.*;

/**
 * Class L05P02MultiHorizontalPanel extends JFrame displays simple window with three buttons.
 * <br><br>
 *
 * Class implements two methods:
 * <ul>
 *     <li>1 - Constructor L05P02MultiHorizontalPanel </li>
 *     <li>2 - main method </li>
 * </ul>
 *
 * @version 21.01.2018
 * @author Rafał Urbański
 */
public class L05P02MultiHorizontalPanel extends JFrame {
    /**
     * <p><br>Constructor<code>L05P02MultiHorizontalPanel()</code> allows to create an object type <code>L05P02MultiHorizontalPanel</code> .
     *
     *      <br>Makes operation assignment on variables type:<br><br></p>
     * <ul>
     *     <li><code>Container cp</code> - container allows to add and collects J - components and sets layout</li>
     *     <li><code>JButton (north, center, south)</code> - component allows to make interaction with programme after click on it, collects name button</li>
     *     <li>Set window characteristics</li>
     * </ul>
     */

    private L05P02MultiHorizontalPanel() {
        Container cp = this.getContentPane();
        cp.setLayout(new BorderLayout());

        JButton north = new JButton("North Panel");
        north.setBackground(Color.blue);

        JButton center = new JButton("Center Panel");
        center.setBackground(Color.red);

        JButton south = new JButton("South Panel");
        south.setBackground(Color.green);

        cp.add(north, BorderLayout.NORTH);
        cp.add(center, BorderLayout.CENTER);
        cp.add(south, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Exit the program when the close-window button clicked
        setTitle("Swing Multi Horizontal Panel"); // "this" JFrame sets title
        pack();// "This" JFrame sets initial size (or pack())
        setLocationRelativeTo(null); //Set the window in a central location on the screen
        setVisible(true); //show it
    }

    /**
     * The entry main() method.
     * @param args Args
     */
    public static void main(String[] args) {
        //Run GUI codes in Event-Dispatching thread for thread-safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new L05P02MultiHorizontalPanel(); // Let the constructor do the job
            }
        });
    }
}
