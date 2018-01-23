/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes2;

/**
 *
 * @author kinbere
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class SelectShapeJPanel extends JPanel
{
   private final int SIZE = 400;
   private ShapeOption shape = ShapeOption.OVAL;
   private Color color;

   // draw the new shape in random locations 20 times
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      Random random = new Random(); // get random-number generator

      g.setColor( color );

      for ( int count = 1; count <= 20; count++ ) 
      {
         // add 10 and 25 to prevent drawing over edge
         int x = ( int ) ( random.nextFloat() * SIZE ) + 10;
         int y = ( int ) ( random.nextFloat() * SIZE ) + 25;
         int width = ( int ) ( random.nextFloat() * ( SIZE - x ) );
         int height = ( int ) ( random.nextFloat() * ( SIZE - y ) );

         // used for circle and square, to prevent drawing off the window
         int diameter = width;

         if ( width > height )
            diameter = height;

         // draw the appropriate shape
         switch ( shape ) 
         {
            case CIRCLE:
               g.drawOval( x, y, diameter, diameter );
               break;
            case SQUARE:
               g.drawRect( x, y, diameter, diameter );
               break;
            case OVAL:
               g.drawOval( x, y, width, height );
               break;
            case RECTANGLE:
               g.drawRect( x, y, width, height );
               break;
         } // end switch
      } // end for
   } // end method paintComponent

   // set new shape
   public void setShape( ShapeOption preference )
   {
      shape = preference;
   } // end method setShape

   public Color getColor()
   {
      return color;
   } // end method getColor

   public void setColor( Color newColor )
   {
      color = newColor;
   } // end method setColor
} // end class SelectShapeJPanel

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
