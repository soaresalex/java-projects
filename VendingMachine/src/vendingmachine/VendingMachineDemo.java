// VendingMachineDemo.java

package vendingmachine;

import javax.swing.JFrame;

public class VendingMachineDemo
{
    public static void main(String[] args)
    {
        double num1, num2, num3, num4, num5, num6;
        
        VendingMachineFrame vendingMachineFrame = new VendingMachineFrame();
        vendingMachineFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vendingMachineFrame.setSize(575, 540);
        vendingMachineFrame.setVisible(true);
    }
} // end of VendingMachineDemo