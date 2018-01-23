// ColorChangerTest.java

package colorchanger;

import javax.swing.JFrame;


public class ColorChangerTest
{
    public static void main(String[] args)
    {
        ColorChanger colorChanger = new ColorChanger();
        colorChanger.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        colorChanger.setSize(400, 200);
        colorChanger.setVisible(true);
    }
}
