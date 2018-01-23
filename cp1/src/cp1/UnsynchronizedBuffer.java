/*
 * UnsynchronizedBuffer.java
 *
 * Created on June 5, 2007, 4:43 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package cp1;

/**
 *
 * @author KinberE
 */
public class UnsynchronizedBuffer implements Buffer {
   private int buffer = -1; // shared by producer and consumer threads

   // place value into buffer
   public void set( int value )
   {
      System.err.println( Thread.currentThread().getName() +
         " writes " + value );

      buffer = value;
   }

   // return value from buffer
   public int get()
   {
      System.err.println( Thread.currentThread().getName() +
         " reads " + buffer );

      return buffer;
   }

} // end class UnsynchronizedBuffer
