// DrawRectOval.java
// Drawing a cascade of shapes based on the user's choice

package drawrectoval;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRectOvalFrame extends JPanel
{
    private int choice; // user's choice of which shape to draw
    
    // constructor sets the user's choice
    public DrawRectOvalFrame(int userChoice)
    {
        choice = userChoice;
    }
    
    // draw a cascade of shapes starting from the top-left corner
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        for (int i = 0; i < 10; i++)
        {
            // pick the shape based on the user's choice
            switch(choice)
            {
                case 1: // draw rectangles
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 2: // draw ovals
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
            }
        }
    }
} // end class DrawRectOvalFrame