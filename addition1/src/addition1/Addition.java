/*
 * Addition.java
 *
 * Created on June 5, 2007, 1:50 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package addition1;

/**
 *
 * @author KinberE
 */

import javax.swing.JOptionPane;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class Addition {

  // main method begins execution of Java application
  public static void main( String args[] )
  {
     String firstNumber;   // first string entered by user
     String secondNumber;  // second string entered by user

     int number1;          // first number to add
     int number2;          // second number to add
     int sum;              // sum of number1 and number2

     // read in first number from user as a string
     firstNumber = JOptionPane.showInputDialog( "Enter first integer" );

     // read in second number from user as a string
     secondNumber =
        JOptionPane.showInputDialog( "Enter second integer" );

     // convert numbers from type String to type int
     number1 = Integer.parseInt( firstNumber );
     number2 = Integer.parseInt( secondNumber );

     // add numbers
     sum = number1 + number2;

     // display result
     JOptionPane.showMessageDialog( null, "The sum is " + sum,
        "Results", JOptionPane.PLAIN_MESSAGE );

     System.exit( 0 );   // terminate application with window

  } // end method main

} // end class Addition