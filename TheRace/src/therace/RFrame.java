
package therace;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RFrame extends JFrame {
    
    boolean doit = true;
    String lead = "";
    int h_x = 0;
    int h_y = 50;
    int t_x = 0;
    int t_y = 160;
    Display p;
    Button start;
    RMoving mo;
    
    public RFrame() {
        setTitle("The Race");
        setSize(1400, 400);
        mo = new RMoving(this);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        Container contentPane = getContentPane();
        getContentPane().setLayout(new BorderLayout());
        
        p = new Display();
        contentPane.add(BorderLayout.CENTER, p);
        Panel q = new Panel();
        start = new Button("Start");
        q.add(start);
        contentPane.add(BorderLayout.SOUTH, q);
        Handler handler = new Handler();
        start.addActionListener(handler);
    } // end of constructor
    
    class Display extends Canvas {
        public void paint(Graphics g) {
            g.setColor(Color.BLACK);
            g.fillRect(0, 50, 1400, 50);
            g.fillRect(0, 160, 1400, 50);
            for(int i = 0; i < 1400; i+=28) {
                g.setColor(Color.WHITE);
                g.drawLine(i, 50, i, 100);
                g.drawLine(i, 160, i, 210);
            }
            g.setColor(Color.RED);
            g.fillRect(10, 40, 1400, 10);
            g.fillRect(10, 100, 1400, 10);
            g.fillRect(10, 150, 1400, 10);
            g.fillRect(10, 210, 1400, 10);
            for(int i = 0; i < 1400; i+=20) {
                g.setColor(Color.WHITE);
                g.fillRect(i, 40, 10, 10);
                g.fillRect(i, 100, 10, 10);
                g.fillRect(i, 150, 10, 10);
                g.fillRect(i, 210, 10, 10);
            }
            ImageIcon hare = new ImageIcon(getClass().getResource("hare.png"));
            Image h = hare.getImage();
            g.drawImage(h, h_x, h_y, this);
            ImageIcon tortoise = new ImageIcon(getClass().getResource("tortoise.png"));
            Image t = tortoise.getImage();
            g.setColor(Color.red);
            g.drawImage(t, t_x, t_y, this);
            g.drawString(lead, 10, 15);
        }
    }
    
    public void move(int x, int y, int animal) {
        if(animal == 1) {
            h_x = x;
            h_y = y;
            if (h_x > t_x) {
                lead = "Hare in the lead by " + ((h_x/28) - (t_x/28)) + " positions";
            }
            else {
                lead = "Tortoise in the lead by " + ((t_x/28) - (h_x/28)) + " positions";
            }
            if(h_x > 1400 && t_x < 1400)
                JOptionPane.showMessageDialog(null, "Hare wins!\n" + "And is award a pail of fresh carrot");
        }
        if(animal == 2) {
            t_x = x;
            t_y = y;
            if(t_x > 1400 && h_x < 1400)
                JOptionPane.showMessageDialog(null, "Tortoise wins!\n" + "And is award a pail of fresh carrot");
        }
        
        p.repaint();
    }
    
    public static void main(String[] args) {
        RFrame theFrame = new RFrame();
        theFrame.show();
    }
    
    class Handler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() ==  start) {
                Racer hare = new Racer(1, mo);
                hare.start();
                Racer tortoise = new Racer(2, mo);
                tortoise.start();
            }
        }
    }
}