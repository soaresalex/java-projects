/*
 * AdditionApplet.java
 *
 * Created on June 5, 2007, 1:45 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package addition;

/**
 *
 * @author KinberE
 */
import java.awt.Graphics;   // import class Graphics
import javax.swing.*;       // import package javax.swing

public class AdditionApplet extends JApplet {
   double sum;  // sum of values entered by user

   // initialize applet by obtaining values from user
   public void init()
   {
      String firstNumber;   // first string entered by user
      String secondNumber;  // second string entered by user

      double number1;       // first number to add
      double number2;       // second number to add

      // obtain first number from user
      firstNumber = JOptionPane.showInputDialog(
         "Enter first floating-point value" );

      // obtain second number from user
      secondNumber = JOptionPane.showInputDialog(
         "Enter second floating-point value" );

      // convert numbers from type String to type double
      number1 = Double.parseDouble( firstNumber );
      number2 = Double.parseDouble( secondNumber );

      // add numbers
      sum = number1 + number2;

   } // end method init

   // draw results in a rectangle on applet’s background
   public void paint( Graphics g )
   {
      // call superclass version of method paint
      super.paint( g );

      // draw rectangle starting from (15, 10) that is 270
      // pixels wide and 20 pixels tall
      g.drawRect( 15, 10, 270, 20 );

      // draw results as a String at (25, 25)
      g.drawString( "The sum is " + sum, 25, 25 );

   } // end method paint

} // end class AdditionApplet