/*
 * IntOutOfRangeException.java
 *
 * Created on June 5, 2007, 5:33 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package intfield;

/*
 *  File: IntOutOfRangeException.java
 *  Author: Java, Java, Java
 *  Description: This Exception subclass is invoked when an
 *   integer value exceeds its bound.
 */

public class IntOutOfRangeException extends Exception {

    public IntOutOfRangeException(int Bound) {
        super("The input value exceeds the bound " + Bound);
    }
}