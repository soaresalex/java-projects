// Project1Test.java
// Test of the Line1, Point1 works

package rectangle;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class RectangleTest
{
    public static void main(String[] args)
    {
        // set the first points
        Rectangle rectangle = new Rectangle(23, 13, 10, 13, 23, 30);
        
        // output the first rectangle
        String output = "Point 1 is [" + rectangle.getX() + ", " + rectangle.getY() + "]" +
                "\nPoint 2 is [" + rectangle.getW() + ", " + rectangle.getZ() + "]" +
                "\nPoint 3 is [" + rectangle.getS() + ", " + rectangle.getT() + "]" +
                "\n\nLine 1 is " + rectangle.getLine1() +
                "\nLine 2 is " + rectangle.getLine2() +
                "\n\nFirst Rectangle:\nHeight is " + rectangle.getHeight() +
                "\nWidth is " + rectangle.getWidth() +
                "\nArea is " + rectangle.getArea() +
                "\nPerimeter is " + rectangle.getPerimeter();
        
        rectangle.setX(11); // set point X for second rectangle
        rectangle.setY(45); // set point Y for second rectangle
        rectangle.setW(17); // set point W for second rectangle
        rectangle.setZ(45); // set point Z for second rectangle
        rectangle.setS(11); // set point S for second rectangle
        rectangle.setT(55); // set point T for second rectangle
        
        // output the second rectangle
        output += "\n\nSecond rectangle:\nHeight is " + rectangle.getHeight() +
                "\nWidth is " + rectangle.getWidth() + "\nArea is " + rectangle.getArea() +
                "\nPerimeter is " + rectangle.getPerimeter();
        
        JOptionPane.showMessageDialog(null, output); // display output
        
        System.exit( 0 );
    }
}
