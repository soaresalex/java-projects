// ShowColors.java
// Demonstrating Colors.
package colorjpanel;

import javax.swing.JFrame;

public class ShowColors
{
    // execute application
    public static void main(String[] args)
    {
        // create frame for ColorJPanel
        JFrame frame = new JFrame("Using colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ColorJPanel colorJPanel = new ColorJPanel();
        frame.add(colorJPanel);
        frame.setSize(450, 180);
        frame.setVisible(true);
    }
} // end class ShowColors