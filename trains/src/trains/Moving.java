/*
 * Moving.java
 *
 * Created on June 5, 2007, 11:20 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package trains;

/**
 *
 * @author KinberE
 */
public class Moving {
//OVERVIEW: This method is repsonsible for the trains movements and enforces
//legal movements
 private boolean lock_a = true;	//enforces two trains cannot be on track a
 private boolean lock_b = true; //enforces two trains cannot be on track b
 private boolean lock_ab = true; //enforces train cannot be on b2 and a1


 TestFrame frame;

 public Moving(TestFrame fr){ frame = fr;}

 public void moving(int track, int x, int y){
     //REQUIRES: track, x and y not be null
     //EFFECTS: calls appropriate "engine" method to drive the train on track

     if(track == 1)moving_a1(track,x,y);
     if(track == 2)moving_a2(track,x,y);
     if(track == 3)moving_b1(track,x,y);
     if(track == 4)moving_b2(track,x,y);
     }
  public void moving_a1(int track, int x, int y){
     	//REQUIRES: track, x and y not be null
     	//EFFECTS: sets train moving on track a1

     	a1_start();
      //these start/stop methods drive the thread
      //they control concurrent track requirements

     	go(track,x,y); //actual method that drives movement
     	a1_stop();
     }

  public synchronized void a1_start(){
     //EFFECTS: if the track is unlocked, it starts train moving on track a1
     //else it waits while the track is locked
     while (!lock_a){
        try{
              wait();
            }
        catch(InterruptedException e)
           {System.out.println("Interrupted Exception"); }
        }

        lock_a = false;
		    notifyAll();

   }



  public synchronized void a1_stop(){
     //EFFECTS: notifies all waiting threads that track a1 is now available
        lock_a = true;
        notifyAll();

   }

  public void moving_a2(int track, int x, int y){
       //REQUIRES: track, x and y not be null
       //EFFECTS: sets train moving on track a2
     a2_start();
     go(track,x,y);
     a2_stop();
     }

  public synchronized void a2_start(){
     //EFFECTS: if the track is unlocked, it starts train moving on track a2
     //else it waits while the track is locked
     while (!((lock_a)&&(lock_ab))){
        try{
              wait();
            }
        catch(InterruptedException e)
           {System.out.println("Interrupted Exception"); }
        }

        lock_a = false;
        lock_ab = false;
		    notifyAll();

        }



  public synchronized void a2_stop(){
     //EFFECTS: notifies all waiting threads that track a2 is now available
        lock_a = true;
        lock_ab = true;
        notifyAll();

   }

  public void moving_b1(int track, int x, int y){
      //REQUIRES: track, x and y not be null
     	//EFFECTS: sets train moving on track b1
     b1_start();
     go(track,x,y);
     b1_stop();
     }

  public synchronized void b1_start(){
     //EFFECTS: if the track is unlocked, it starts train moving on track b1
     //else it waits while the track is locked
     while (!((lock_b)&&(lock_ab))){

        try{
              wait();
            }
        catch(InterruptedException e)
           {System.out.println("Interrupted Exception"); }
        }

        lock_b = false;
        lock_ab = false;
		    notifyAll();

     }



   public synchronized void b1_stop(){
      //EFFECTS: notifies all waiting threads that track b1 is now available
        lock_b = true;
        lock_ab = true;
        notifyAll();
   }

   public  void moving_b2(int track, int x, int y){
      //REQUIRES: track, x and y not be null
     	//EFFECTS: sets train moving on track b2
      b2_start();
     	go(track,x,y);
     	b2_stop();
     }

   public synchronized void b2_start(){
       //EFFECTS: if the track is unlocked, it starts train moving on track b2
       //else it waits while the track is locked
     while (!lock_b){
        try{
              wait();
            }
        catch(InterruptedException e)
           {System.out.println("Interrupted Exception"); }
        }
		notifyAll();
        lock_b = false;

     }



   public synchronized void b2_stop(){
      //EFFECTS: notifies all waiting threads that track b2 is now available
        lock_b = true;
        notifyAll();
   }



   public void go(int track, int x, int y){
   	  //REQUIRES: track, x and y not be null
      //MODIFIES: x and y
   	  //EFFECTS: drives the trains movements
        if((track == 1)||(track == 3)){


                while (x<= 500){
                    
                    x = x+5;
                    frame.move(x,y,track);
                         try {
                               Thread.sleep(100); // slows down the train
                             }
                         catch(Exception e)
                            {System.err.println("Exception");}
                         }

                } //end if

        if(track == 2){
                 while(x< 250) {x = x+5;
                         frame.move(x,y,track);
                         try{
                               Thread.sleep(100); // slows down the train
                             }
                         catch(Exception e)
                            {System.err.println("Exception");}
                         }
                  while(y<470){ y = y+5;
                            frame.move(x,y,track);
                         try{
                               Thread.sleep(100); // slows down the train
                             }
                         catch(Exception e)
                            {System.err.println("Exception");}
                         }
                 }//end if

        if(track == 4){
                 while(x< 150) {x = x+5;
                         frame.move(x,y,track);
                         try{
                               Thread.sleep(200); // slows down the train
                             }
                         catch(Exception e)
                            {System.err.println("Exception");}
                         }
                  while(y<470){ y = y+5;
                            frame.move(x,y,track);
                         try{
                               Thread.sleep(200); // slows down the train
                             }
                         catch(Exception e)
                            {System.err.println("Exception");}
                         }
                 }//end if
        }//end go
}
