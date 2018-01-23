
package trains;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TestFrame extends JFrame {

	boolean doit=true;
 	String s_a1 = "";
  	String s_a2 = "";
  	String s_b1 = "";
  	String s_b2 = "";
  	int a1_x = -20;
  	int a1_y = 200;
  	int b1_x = -20;
  	int b1_y = 300;
  	int a2_x = -20;
  	int a2_y = 200;
  	int b2_x = -20;
  	int b2_y = 300;
  	Display p;
  	Button a1;
  	Button a2;
  	Button b1;
  	Button b2;

   	Moving mo;
   	public TestFrame() {
		  setTitle("RAILROAD");
		  setSize(500, 500);
  		mo = new Moving(this);

		  // make the "windowClosing" event kill the program
		  addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e)
		  { System.exit(0); }
	      });
      // Note: pane vs panel!
      Container contentPane = getContentPane();
      getContentPane().setLayout(new BorderLayout());

  	 	p = new Display(); //canvas for painting train moves
   		contentPane.add(BorderLayout.CENTER, p);
   		Panel q = new Panel(); //panel for buttons
   		a1 = new Button("a1"); //set up for the buttons
   		q.add(a1);
   		a2 = new Button("a2");
   		q.add(a2);
   		b1 = new Button("b1");
   		q.add(b1);
   		b2 = new Button("b2");
   		q.add(b2);
   		contentPane.add(BorderLayout.SOUTH, q);
		  Handler handler = new Handler();
   		a1.addActionListener(handler);
   		a2.addActionListener(handler);
   		b1.addActionListener(handler);
   		b2.addActionListener(handler);


} // end of constructor

class Display extends Canvas{

	public void paint(Graphics g)
   	//EFFECTS: displays the graphics for the train tracks and the train as represented by a colored circle

   	{
   		g.setColor(Color.blue);
		  for(int i=0;i<500;i+=5){
     		g.drawLine(i,200,i,215);
     		}
     	for(int i=0;i<500;i+=5){
     		g.drawLine(i,300,i,315);
     		}
     	for(int i=215;i<500;i+=5){
     		g.drawLine(250,i,265,i);
     		}
     	for(int i=315;i<500;i+=5){
     		g.drawLine(150,i,165,i);
     		}
     	g.drawLine(0,200,500,200);
     	g.drawLine(0,215,500,215); //track a1
     	g.drawLine(0,315,500,315);  //track b1
     	g.drawLine(0,300,500,300);
     	g.drawLine(250,215,250,500);   //end of track a2
     	g.drawLine(265,215,265,500);
     	g.drawLine(150,315,150,500); //end of track b2
     	g.drawLine(165,315,165,500);
     	g.fillOval(a1_x,a1_y,15,15);
     	g.fillOval(a2_x,a2_y,15,15);
     	g.fillOval(b1_x,b1_y,15,15);
     	g.fillOval(b2_x,b2_y,15,15);
     	g.drawString(s_a1, 10,10);
     	g.drawString(s_a2, 10, 30);
     	g.drawString(s_b1, 10, 50);
     	g.drawString(s_b2, 10, 70);
   }
}

	public void move(int x, int y, int track)
       	//REQUIRES: x,y and track must not be null
        //MODIFIES: this
       	//EFFECTS: changes the cooridinates of our train to (x,y);

           {
            if(track == 1){
             	a1_x = x;
             	a1_y = y;
                  if ((Math.abs(a1_x -250)<20) && (Math.abs(a1_y -205)<20))
                       s_a1 = "Train on A1 at Junction!";
                  else
       				         s_a1 = "Train on A1 at "+a1_x+" and "+a1_y;
				}

            if(track == 2){
             	a2_x = x;
             	a2_y = y;
                  if ((Math.abs(a2_x -250)<20) && (Math.abs(a2_y -205)<20))
                       s_a2 = "Train on A2 at Junction!";
                  else
                       s_a2 = "Train on A2 at "+a2_x+" and "+a2_y;
                 }

            if(track == 3){
             	b1_x = x;
             	b1_y = y;
             	  if ((Math.abs(b1_x -150)<20) && (Math.abs(b1_y -305)<20))
                   	   s_b1 = "Train on B1 at Junction!";
             	  else
         			         s_b1 = "Train on B1 at "+b1_x+" and "+b1_y;
                 	}


            if(track == 4){
             	b2_x = x;
             	b2_y = y;
                if ((Math.abs(b2_x -150)<20) && (Math.abs(b2_y -305)<20))
                       s_b2 = "Train on B2 at Junction!";
                else
                       s_b2 = "Train on B2 at "+b2_x+" and "+b2_y;
                 }


           	p.repaint();

           }



public static void main(String args[]){
 	TestFrame theFrame = new TestFrame();
	theFrame.show();
  }


class Handler implements ActionListener{
	//OVERVIEW: Responsible for creating our train threads. The thread is set to the appropriate track based on
  //which button is chosen

	public void actionPerformed(ActionEvent e)
         {

         	  if (e.getSource() == a1)
                {
                  Train1 t1 = new Train1(1,mo);
                  t1.start();

                }
            else if(e.getSource() == a2)
                {
                   Train1 t2 = new Train1(2,mo);
                   t2.start();
                }
            else if(e.getSource() == b1)
                {
                   Train1 t3 = new Train1(3,mo);
                   t3.start();
                }
            else if(e.getSource() == b2)
                {
                   Train1  t4= new Train1(4,mo);
                   t4.start();

                }
         }
    } //end  handler

 }
