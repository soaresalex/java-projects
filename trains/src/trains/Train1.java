/*
 * Train1.java
 *
 * Created on June 5, 2007, 11:19 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package trains;

/**
 *
 * @author KinberE
 */

public class Train1 extends Thread {
      //OVERVIEW: This is the train thread. A train has a notion of
   		//position based on (x,y) cooridinates. Also, it has a notion
   		//of which track it is on.

   private int x;
   private int y;
   private int track;
   Moving m;
   public Train1(int tr, Moving m1 ){
     //EFFECTS: initializes a train thread
           track = tr;
           m = m1;
           if(track == 1) {x = 0; y = 200;}
           if(track == 2) {x = 0; y = 200;}
           if(track == 3) {x = 0; y = 300;}
           if(track == 4) {x = 0; y = 300;}
            }


   public void  run(){
     //EFFECTS: runs a train thread

            m.moving(track,x,y);
            }


}

