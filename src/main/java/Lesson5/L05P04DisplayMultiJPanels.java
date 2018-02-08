package Lesson5;

import javax.swing.*;
import java.awt.*;

/**
 * Class L05P04DisplayMultiJPanels extends JFrame displays simple window with five buttons on five different panels insert in different position on layout
 * <p>
 * <br><br>
 * Class implements two methods:
 * <ul>
 *      <li> 1 - Constructor L05P04DisplayMultiJPanels</li>
 *      <li> 2 - main method</li>
 * </ul>
 *
 * @author Rafał Urbański
 * @version 22.01.2018
 */
public class L05P04DisplayMultiJPanels extends JFrame {

    /**
     * <p><br>Constructor <code>L05P04DisplayMultiJPanels()</code> allows to create an object type <code>L05P04DisplayMultiJPanels</code> .
     *      <br>Calls base <code>JFrame</code> class constructor and set title of window.
     *      <br>Makes operations assignment on variables type:<br><br></p>
     * <ul>
     *      <li><code>Container yourContainer</code> - container allows to add and collects J - components</li>
     *      <li><code>JLabel label</code> - component collects text data inside it</li>
     *      <li><code>JButton (eastButton, northButton, southButton, westButton, centerButton) </code>
     *          - component allows to make interaction with programme after click on it, collects name button</li>
     *      <li><code>JPanel (northPanel, eastPanel, southPanel, westPanel, centerPanel)</code>
     *          - container allows to add and collects J - components</li>
     *      <li>Set window characteristics</li>
     * </ul>
     */
     L05P04DisplayMultiJPanels() {
        super("Multiple JPanel's & Buttons");

        Container yourContainer = this.getContentPane();
        yourContainer.setLayout(new BorderLayout());

        JButton northButton = new JButton("North Panel");
        JButton eastButton = new JButton("East Panel");
        JButton southButton = new JButton("South Panel");
        JButton westButton = new JButton("West Panel");
        JButton centerButton = new JButton("Center Panel");

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        northPanel.add(northButton);
        northPanel.setBackground(Color.cyan);
        yourContainer.add(northPanel, BorderLayout.NORTH);

        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new FlowLayout());
        eastPanel.add(eastButton);
        eastPanel.setBackground(Color.green);
        yourContainer.add(eastPanel, BorderLayout.EAST);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout());
        southPanel.add(southButton);
        southPanel.setBackground(Color.yellow);
        yourContainer.add(southPanel, BorderLayout.SOUTH);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new FlowLayout());
        westPanel.add(westButton);
        westPanel.setBackground(Color.magenta);
        yourContainer.add(westPanel, BorderLayout.WEST);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());
        centerPanel.add(centerButton);
        centerPanel.setBackground(Color.red);
        yourContainer.add(centerPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);


    }

    /**
     * The entry main() method
     *
     * @param args Args
     */
    public static void main(String[] args) {
        //Run GUI codes in Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new L05P04DisplayMultiJPanels(); //Let the constructor do the job
            }
        });
    }
}
