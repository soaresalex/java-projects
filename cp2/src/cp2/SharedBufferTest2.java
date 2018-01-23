/*
 * SharedBufferTest2.java
 *
 * Created on June 5, 2007, 4:48 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package cp2;

/**
 *
 * @author KinberE
 */
public class SharedBufferTest2 {

   public static void main( String [] args )
   {
      // create shared object used by threads; we use a SynchronizedBuffer
      // reference rather than a Buffer reference so we can invoke
      // SynchronizedBuffer method displayState from main
      SynchronizedBuffer sharedLocation = new SynchronizedBuffer();

      // Display column heads for output
      StringBuffer columnHeads = new StringBuffer( "Operation" );
      columnHeads.setLength( 40 );
      columnHeads.append( "Buffer\tOccupied Count" );
      System.err.println( columnHeads );
      System.err.println();
      sharedLocation.displayState( "Initial State" );

      // create producer and consumer objects
      Producer producer = new Producer( sharedLocation );
      Consumer consumer = new Consumer( sharedLocation );

      producer.start();  // start producer thread
      consumer.start();  // start consumer thread

   } // end main

} // end class SharedBufferTest2
