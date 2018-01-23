
package drawshapes;

import javax.swing.JFrame;

public class DrawShapesTest
{
    public static void main(String[] args)
    {
        DrawJFrame drawJFrame = new DrawJFrame();
        drawJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawJFrame.setSize(500, 500);
        drawJFrame.setVisible(true);
    }
}