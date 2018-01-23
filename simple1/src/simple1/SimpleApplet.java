/*
 * SimpleApplet.java
 *
 * Created on June 5, 2007, 5:43 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package simple1;

/**
 *
 * @author KinberE
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleApplet extends Applet implements ActionListener
{
    private Button toggle;       // From java.awt.Button


   /*
    * The init() method instantiates the toggle Button, assigns
    * it an ActionListener, and adds it to the applet. This causes
    * the button to appear on the applet's window.
    */
    public void init()
    {
        toggle = new Button ("The machine is off");
        toggle.addActionListener(this);
        add(toggle);
    } // init()

    /*
     * The actionPerformed() method is called whenever the toggle
     * button is clicked. It reverses the button's label.
     */
    public void actionPerformed(ActionEvent e)
    {
        String str = toggle.getLabel();              // Get the toggle Button's label
        if (str.equals("The machine is on"))         // and change it
            toggle.setLabel("The machine is off");
        else                                         // or
            toggle.setLabel("The machine is on");    // change it back
    } // actionPerformed()
} // SimpleApplet
