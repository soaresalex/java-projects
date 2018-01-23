/*
 * SharedBufferTest.java
 *
 * Created on June 5, 2007, 4:40 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package cp1;

/**
 *
 * @author KinberE
 */
public class SharedBufferTest {

    public static void main( String [] args )
    {
        // create shared object used by threads
        Buffer sharedLocation = new UnsynchronizedBuffer();

        // create producer and consumer objects
        Producer producer = new Producer( sharedLocation );
        Consumer consumer = new Consumer( sharedLocation );

        producer.start();  // start producer thread
        consumer.start();  // start consumer thread

    } // end main

} // end class SharedCell

