/*
 * Events1.java
 *
 * Created on June 5, 2007, 5:01 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package events1;

/**
 *
 * @author KinberE
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class Events1 extends JApplet {
  private JButton left, right;
  private Canvas display;

  public void init()
  {
   getContentPane().setLayout(new BorderLayout());
   display = new Canvas();
   getContentPane().add(BorderLayout.CENTER, display);
   display.setBackground(Color.white);
   JPanel p = new JPanel();
   left = new JButton("left");
   p.add(left);
   right = new JButton("right");
   p.add(right);
   getContentPane().add(BorderLayout.SOUTH, p);
   Handler handler = new Handler();
   left.addActionListener(handler);
   right.addActionListener(handler);
   }
class Handler implements ActionListener{
   public void actionPerformed(ActionEvent e)
    { if(e.getSource() == left)
            display.setBackground(Color.red);
      else if(e.getSource() == right)
            display.setBackground(Color.blue);

      display.repaint();

    }
  }
}
