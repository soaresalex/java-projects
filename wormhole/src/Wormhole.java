/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JApplet;
import java.awt.*;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author kinbere
 */
public class Wormhole extends JApplet {

   public void paint(Graphics g)
   { // must right-click and select "Run File" to run this program
       g.setColor(Color.black);
       g.fillRect(0,0,500, 350);
       
       //draw 10 nested "holes"
       g.setColor(new Color(0,0,25));
       g.fillOval(50, 50, 350, 200);
       
       g.setColor(new Color(10,10,50));
       g.fillOval(80,60,320,180);
       
       g.setColor(new Color(20,20,75));
       g.fillOval(110,70,290,160);
       
       g.setColor(new Color(30,30,100));
       g.fillOval(140,80,260,140);
       
       g.setColor(new Color(40,40,125));
       g.fillOval(170,90,230,120);
       
       g.setColor(new Color(50,50,150));
       g.fillOval(200,100,200,100);
       
       g.setColor(new Color(60,60,175));
       g.fillOval(230,110,170,80);
       
       g.setColor(new Color(70,70,200));
       g.fillOval(260,120,140,60);
       
       g.setColor(new Color(80,80,225));
       g.fillOval(290,130,110,40);
       
       g.setColor(new Color(90,90,250));
       g.fillOval(320,140,80,20);
       
       g.setColor(Color.blue);
       g.setFont(new Font("TimesRoman", Font.BOLD, 36));
       g.drawString("On to Cydonia!", 22,300);
       g.setColor(Color.white);
       g.drawString("On to Cydonia!", 20,298); 
       
       
       
   }
    // TODO overwrite start(), stop() and destroy() methods
}
