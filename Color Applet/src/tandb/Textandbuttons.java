/*
 * Textandbuttons.java
 *
 * Created on June 5, 2007, 5:50 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package tandb;

/**
 *
 * @author KinberE
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class Textandbuttons extends JApplet {
  private Display m;
  private JButton green;
  private JTextField text;

  public void init()
  {
    getContentPane().setLayout(new BorderLayout());
    m = new Display();
    getContentPane().add(BorderLayout.CENTER, m);
    JPanel p = new JPanel();
    green =new JButton("green");
    text= new JTextField(15);
    p.add(text);
    p.add(green);
    getContentPane().add(BorderLayout.SOUTH, p);
    green.addActionListener(m);
    text.addActionListener(m);
    }

    class Display extends Canvas implements ActionListener
    {
      public Display()
      {
       setBackground(Color.red);
       }
       public void actionPerformed(ActionEvent e)
       {
        Object source =e.getSource();
       String newcolor = e.getActionCommand();
                       if(source == green)
         {setBackground(Color.green);
         }
         else if ((source == text)&&(newcolor.equals("blue")))
         {
         setBackground(Color.blue);
          }
          repaint();
          }
          }
          }

