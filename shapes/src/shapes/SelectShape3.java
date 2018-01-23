/*
 * SelectShape3.java
 *
 * Created on June 5, 2007, 5:25 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package shapes;

/**
 *
 * @author KinberE
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SelectShape3 extends JFrame {
   private final int CIRCLE = 0;
   private final int SQUARE = 1;
   private final int OVAL = 2;
   private final int RECTANGLE = 3;
   private JComboBox choice;
   private JButton chooseColor;
   private Color color;
   private int shape;

   private ToolWindow tools;

   public SelectShape3()
   {
      setSize( 300, 200 );
      show();



      tools = new ToolWindow();
   }

   public void paint( Graphics g )
   {
      super.paint( g );

      for ( int k = 1; k <= 20; k ++ ) {
         int x = ( int ) ( Math.random() * getSize().width );
         int y = ( int ) ( Math.random() * getSize().height );
         int w = ( int ) ( Math.random() * getSize().width  );
         int h = ( int ) ( Math.random() * getSize().height );

         g.setColor( color );

         switch ( shape ) {
            case CIRCLE:
               g.drawOval( x, y, w, w );
               break;
            case SQUARE:
               g.drawRect( x, y, w, w );
               break;
            case OVAL:
               g.drawOval( x, y, w, h );
               break;
            case RECTANGLE:
               g.drawRect( x, y, w, h );
               break;
         }
      }
   }

  

   private class ToolWindow extends JFrame {
      public ToolWindow()
      {
         choice = new JComboBox();
         choice.addItem( "Circle" );
         choice.addItem( "Square" );
         choice.addItem( "Oval" );
         choice.addItem( "Rectangle" );

         choice.addItemListener(
            new ItemListener() {
               public void itemStateChanged( ItemEvent e )
               {
                   shape = choice.getSelectedIndex();
              SelectShape3.this.repaint();
               }
            }
         );

         getContentPane().add( choice, BorderLayout.SOUTH );

         chooseColor = new JButton( "Pick Color" );
         chooseColor.addActionListener(
            new ActionListener() {
               public void actionPerformed( ActionEvent e )
               {
                  color = JColorChooser.showDialog( null, "Pick Color", Color.black );
               }
            }
         );
         getContentPane().add( chooseColor, BorderLayout.NORTH );

         pack();
         setLocation( 300, 0 );
         show();
      }
   }


   public static void main( String args[] )
   {
      SelectShape3 app = new SelectShape3();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            }
         }
      );
   }
}

