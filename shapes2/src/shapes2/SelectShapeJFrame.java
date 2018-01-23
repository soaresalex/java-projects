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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SelectShapeJFrame extends JFrame 
{
   private ShapeOption shapeOptions[] = { ShapeOption.CIRCLE,
      ShapeOption.SQUARE, ShapeOption.OVAL, ShapeOption.RECTANGLE };
   private ShapeOption shape = ShapeOption.CIRCLE;
   private JButton chooseColorJButton;
   private JComboBox choiceJComboBox;
   private JPanel controlJPanel;
   private SelectShapeJPanel selectShapeJPanel;

   public SelectShapeJFrame()
   {
      super( "Selecting Shapes" );

      controlJPanel = new JPanel();
      selectShapeJPanel = new SelectShapeJPanel();

      choiceJComboBox = new JComboBox( shapeOptions );
      choiceJComboBox.addItemListener(

         new ItemListener() // anonymous inner class
         {
            public void itemStateChanged( ItemEvent e )
            {
               selectShapeJPanel.setShape(
                  ( ShapeOption ) choiceJComboBox.getSelectedItem() );
               selectShapeJPanel.repaint();
            } // end method itemStateChanged
         } // end anonymous inner class
      ); // end call to addItemListener

      // add button that pops up a color dialog
      chooseColorJButton = new JButton( "Pick Color" );
      chooseColorJButton.addActionListener(

         new ActionListener() // anonymous inner class
         {
            public void actionPerformed( ActionEvent e )
            {
               selectShapeJPanel.setColor( JColorChooser.showDialog( null, 
                  "Pick Color", Color.RED ) );
               selectShapeJPanel.repaint();
            } // end method actionPerformed
         } // end anonymous inner class
      ); // end call to addActionListener

      controlJPanel.add( choiceJComboBox );
      controlJPanel.add( chooseColorJButton );

      add( selectShapeJPanel, BorderLayout.CENTER );
      add( controlJPanel, BorderLayout.SOUTH );
   } // end SelectShapeJFrame constructor
} // end class SelectShapeJFrame

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

