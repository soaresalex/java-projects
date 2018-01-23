// DrawRectOvalTest.java
// Obtaining user input and creating a JFrame to display Shapes.

package drawrectoval;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DrawRectOvalTest
{
    public static void main(String[] args)
    {
        // obtain user's choice
        String input = JOptionPane.showInputDialog(
        "Enter 1 to draw rectangles\n" + "Enter 2 to draw ovals");
        
        int choice = Integer.parseInt(input); // convert input to int
        
        // creates the panel with the user's input
        DrawRectOvalFrame panel = new DrawRectOvalFrame(choice);
        
        JFrame application = new JFrame(); // creates a new JFrame
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
} // end class ShapesTest