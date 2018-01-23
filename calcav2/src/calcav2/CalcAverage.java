/*
 * CalcAverage.java
 *
 * Created on June 5, 2007, 2:38 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package calcav2;
/*
 * File: CalcAverage.java
 * Author: Java, Java, Java
 * Description: This program illustrates Java's default
 *  handling of exceptions. In this case a divide-by-zero
 *  error will occur in intAverage(). Since the program takes
 *  no action to handle this error, Java's default exception
 *  handling will do it. An exception will be thrown in
 *  intAverage(). This will cause an error message and a
 *  trace of the method call stack to be printed. The program
 *  will then be aborted.
 */

public class CalcAverage {

    /**
     * intAverage() computes the average of the first N elements of arr
     * @param arr -- an array of integers
     * @param N  -- the number of elements to be averaged
     * @return the average of arr[0] through arr[N-1] is returned
     * Pre:  N > 0
     * Post: intAverage = the average of arr[0] through arr[N-1]
     */
    public int intAverage(int arr[], int N) {
        int avg = 0;
        for (int k = 0; k < N; k++)
            avg += arr[k];
        avg = avg / N;
        return avg;
    } // intAverage()

    /**
     * main () creates an instance of this class and invokes its
     *  intAverage() method with N=0. This will cause a
     *  divide-by-0 exception to be thrown in intAverage().
     */
    public static void main(String args[]) {
        int numbers[] = {10, 20, 30, 30, 20, 10};
        CalcAverage ca = new CalcAverage();
        System.out.println( "AVG + " + ca.intAverage(numbers, 0));
    } // main()
} // CalcAverage

