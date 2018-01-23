/*
 * Texttest1.java
 *
 * Created on June 5, 2007, 5:52 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package ttest1;

/**
 *
 * @author KinberE
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class Texttest1 extends JApplet {
  private Display m;
  private JTextField text;

  public void init()
  {
    getContentPane().setLayout(new BorderLayout());
    m = new Display();
    getContentPane().add(BorderLayout.CENTER, m);
    JPanel p = new JPanel();
    text= new JTextField(15);
    p.add(text);
    getContentPane().add(BorderLayout.SOUTH, p);
    text.addActionListener(m);
    }

    class Display extends JPanel implements ActionListener
    {
      public Display()
      {
       setBackground(Color.red);
       }
       public void actionPerformed(ActionEvent e)
       {
       String newcolor = e.getActionCommand();
       if(newcolor.equals("1"))
         {setBackground(Color.blue);
         }
         else if (newcolor.equals("green"))
         {
         setBackground(Color.green);
          }
          repaint();
          }
          }
          }

