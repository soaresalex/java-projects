// calculatorDemo.java

package mycalculator;

import javax.swing.JFrame;

public class CalculatorDemo
{
    public static void main(String[] args)
    {
        CalculatorFrame calculatorFrame = new CalculatorFrame();
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorFrame.setSize(350, 400);
        calculatorFrame.setVisible(true);
    }
}