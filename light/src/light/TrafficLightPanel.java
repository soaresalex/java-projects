/*
 * TrafficLightPanel.java
 *
 * Created on June 5, 2007, 5:36 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package light;

/**
 *
 * @author KinberE
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * A class that mimicks a traffic light. It draws red, yellow, and green
 * circles. The cirlce that is drawn is determined by a timer.
 */
public class TrafficLightPanel extends JPanel  implements ActionListener
{
  public final static int RED = 1;
  public final static int YELLOW = 2;
  public final static int GREEN = 3;
  private int colorOfLight;     // the current color of the light
  private Timer lightTimer;    // controls what is to be drawn

  /**
   * default constructor. it initializes all the data
   */
  public TrafficLightPanel()
  {
     this.setSize(600, 300);
     colorOfLight = RED;
     this.repaint();
  }

  /**
   * Method to draw the current color of the traffic light
   */
  public void paintComponent(Graphics g)
  {
     super.paintComponent(g);

     if (colorOfLight == RED)
     {
        // red light, draw red circle at bottom of screen
        g.setColor(Color.red);
        g.fillOval((600 - 60) / 2, 300 - 60, 60, 60);
     }
     else if (colorOfLight == YELLOW)
     {
        // yellow light, draw yellow circle in middle of screen
        g.setColor(Color.yellow);
        g.fillOval((600 - 60) / 2, 300 - 130, 60, 60);
     }
     else if (colorOfLight == GREEN)
     {
        // green light, draw green circle at top of screen
        g.setColor(Color.green);
        g.fillOval((600 - 60) / 2, 300 - 200, 60, 60);
     }

  }

  /**
   * Method to listen to any events. The timer will be
   * triggering this even
   */
  public void actionPerformed(ActionEvent e)
  {
      colorOfLight++;
      if (colorOfLight < 4)
            this.repaint();  // draw new color
      else
         lightTimer.stop();   // already green light. stop timer
  }

  /**
   * Method that starts the timer to draw the traffic lights
   */
  public void draw()
  {
     if (lightTimer == null || lightTimer.isRunning() == false)
     {
        // initialize timer. Start with red light
        colorOfLight = RED - 1;
        lightTimer = new Timer(1000, this);
        lightTimer.start();
     }
     else
     {
        if (lightTimer.isRunning() == true)
        {
          // restart timer
          colorOfLight = RED - 1;
          lightTimer.restart();
        }
     }

  }

}
