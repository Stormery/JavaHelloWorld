package Lesson5;

import javax.swing.*;
import java.awt.*;

/**
 * Class L05P03DisplayFramePanels extends JFrame displays simple window with five buttons in different colors
 * and positions
 * <br><br>
 *
 * Class implements two methods:
 * <ul>
 *     <li> 1 - Constructor L05P03DisplayFramePanels </li>
 *     <li> 2 - main method </li>
 * </ul>
 *
 * @version 22.01.2018
 * @author Rafał Urbański
 */

public class L05P03DisplayFramePanels extends JFrame{
    /**
     * <p><br>Constructor<code>L05P03DisplayFramePanels()</code> allows to create an object type <code>L05P03DisplayFramePanels</code> .
     *
     *      <br>Makes operation assignment on variables type:<br><br></p>
     * <ul>
     *     <li><code>JFrame frame </code> - component allows to add and collects J - components and set title of window</li>
     *     <li><code>Container cp</code> - container allows to add and collects J - components and sets layout</li>
     *     <li><code>JButton (east, north, south, west, center)</code> - component allows to make interaction with programme after click on it, collects name button</li>
     *     <li><code>JPanel content </code> - create content pane, set layout, add components</li>
     *     <li>Set window characteristics</li>
     * </ul>
     */
    private L05P03DisplayFramePanels() {
        JFrame frame = new JFrame("Swing Display Frame Panels");

        Container cp = this.getContentPane();
        cp.setLayout(new BorderLayout());

        JButton north = new JButton("North Panel");
        north.setBackground(Color.cyan);

        JButton east = new JButton("East Panel");
        east.setBackground(Color.green);

        JButton south = new JButton("South Panel");
        south.setBackground(Color.yellow);

        JButton west = new JButton("West Panel");
        west.setBackground(Color.magenta);

        JButton center = new JButton("Center Panel");
        center.setBackground(Color.red);

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(north, BorderLayout.NORTH);
        content.add(east,BorderLayout.EAST);
        content.add(south, BorderLayout.SOUTH);
        content.add(west,BorderLayout.WEST);
        content.add(center, BorderLayout.CENTER);


        frame.setContentPane(content);
        //frame.setTitle("Border Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    /**
     * The entry main() method.
     *
     * @param args Args
     */
    public static void main(String[] args){
        //Run GUI codes in Event-Dispatching thread for thread-safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new L05P03DisplayFramePanels(); //Let the constructor do the job
            }
        });
    }
}
