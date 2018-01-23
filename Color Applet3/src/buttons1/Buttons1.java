/*
 * Buttons1.java
 *
 * Created on June 5, 2007, 2:33 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package buttons1;

/**
 *
 * @author KinberE
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class Buttons1 extends JApplet {

  private JButton left, right;
  private Display myDisplay;

  public void init()
  {
    getContentPane().setLayout(new BorderLayout());
    myDisplay = new Display();
    getContentPane().add(BorderLayout.CENTER, myDisplay);
    JPanel p = new JPanel();
    left = new JButton("left");
    p.add(left);
    right = new JButton("right");
    p.add(right);
    getContentPane().add(BorderLayout.SOUTH, p);
    left.addActionListener(myDisplay);
    right.addActionListener(myDisplay);
    }
class Display extends Canvas implements ActionListener
{
public Display()
        {
          setBackground(Color.white);
          }
public void actionPerformed(ActionEvent e)
{
 String direction = e.getActionCommand();
 if (direction.equals("left"))
   {
     setBackground(Color.red);
     }

 else if (direction.equals("right"))
 {
 setBackground(Color.blue);
 }
 repaint();
 }
 }




  }

