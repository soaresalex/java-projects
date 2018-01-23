/*
 * TrafficLightControlFrame.java
 *
 * Created on June 5, 2007, 5:35 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package light;

/**
 *
 * @author KinberE
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * Graphical class that controls a traffic light
 */
public class TrafficLightControlFrame extends JFrame
{
  private JPanel buttonPanel;
  private TrafficLightPanel trafficLight;
  private JButton btnChangeLight;
  private JButton btnExit;

  /**
   * Default constructor that draws the screen
   */
  public TrafficLightControlFrame()
  {
     super("Traffic Light");

     trafficLight = new TrafficLightPanel();
     trafficLight.setBackground(Color.blue);

     // implement button to change the light
     btnChangeLight = new JButton("Change Light");
     btnChangeLight.addActionListener(
        new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               trafficLight.draw();
           }
        }
     );

     // implement button to close application when pressed
     btnExit = new JButton("Exit");
     btnExit.addActionListener(
        new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
              JOptionPane.showMessageDialog(null, "Goood Bye", "Exiting", JOptionPane.INFORMATION_MESSAGE);
              System.exit(0);
           }
        }
     );

     // setting layout of the screen
     buttonPanel = new JPanel();
     buttonPanel.setLayout(new GridLayout(1, 2));
     buttonPanel.add(btnChangeLight);
     buttonPanel.add(btnExit);

     Container c = this.getContentPane();
     c.add(trafficLight, BorderLayout.CENTER);
     c.add(buttonPanel, BorderLayout.SOUTH);

     this.setSize(640, 480);
     this.show();
    try {
      jbInit();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }

  }

  /**
   * main method
   */
  public static void main(String[] args)
  {
    TrafficLightControlFrame trafficLightControlFrame = new TrafficLightControlFrame();

    trafficLightControlFrame.addWindowListener(
      new WindowAdapter()
      {
         public void windowClosing(WindowEvent e)
         {
            System.exit(0);
         }
      }
    );

  }

  private void jbInit() throws Exception {
  }

}
