/*
 * WelcomeLines.java
 *
 * Created on June 5, 2007, 6:01 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package welcomelines;

/**
 *
 * @author KinberE
 */

import java.awt.Graphics;    // import class Graphics
import javax.swing.JApplet;  // import class JApplet

public class WelcomeLines extends JApplet {

   // draw lines and a string on applet’s background
   public void paint( Graphics g )
   {
      // call superclass version of method paint
      super.paint( g );

      // draw horizontal line from (15, 10) to (210, 10)
      g.drawLine( 15, 10, 210, 10 );

      // draw horizontal line from (15, 30) to (210, 30)
      g.drawLine( 15, 30, 210, 30 );

      // draw String between lines at location (25, 25)
      g.drawString( "Welcome to Java Programming!", 25, 25 );

   } // end method paint

} // end class WelcomeLines
