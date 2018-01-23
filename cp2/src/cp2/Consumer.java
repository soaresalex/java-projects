/*
 * Consumer.java
 *
 * Created on June 5, 2007, 4:52 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package cp2;

/**
 *
 * @author KinberE
 */

public class Consumer extends Thread {
   private SynchronizedBuffer sharedLocation; // reference to shared object

   // constructor
   public Consumer( SynchronizedBuffer shared )
   {
      super( "Consumer" );
      sharedLocation = shared;
   }

   // read sharedLocation's value four times and sum the values
   public void run()
   {
      int sum = 0;

      for ( int count = 1; count <= 4; count++ ) {

         // sleep 0 to 3 seconds, read value from Buffer and add to sum
         try {
            Thread.sleep( ( int ) ( Math.random() * 3001 ) );
            sum += sharedLocation.get();
         }

         // if sleeping thread interrupted, print stack trace
         catch ( InterruptedException exception ) {
            exception.printStackTrace();
         }
      }

      System.err.println( getName() + " read values totaling: " + sum +
         ".\nTerminating " + getName() + ".");

   } // end method run

} // end class Consumer
