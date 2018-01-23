/*
 * Events2.java
 *
 * Created on June 5, 2007, 5:22 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package events2;

/**
 *
 * @author KinberE
 */

import javax.swing.UIManager;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Events2 extends JFrame{
  private JButton left, right;
  private Canvas display;

  public Events2()
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
   setSize(300,300);  //sets size of the frame
   show();  //displays frame
   }

 public static void main(String args[])
  {
   Events2 example = new Events2();

   example.addWindowListener(
        new WindowAdapter(){
          public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
          }
        );
   }


class Handler implements ActionListener{
   public void actionPerformed(ActionEvent e)
    { if(e.getSource() == left)
            display.setBackground(Color.red);
      else if(e.getSource() == right)
            display.setBackground(Color.yellow);

      display.repaint();
    }
  }
}