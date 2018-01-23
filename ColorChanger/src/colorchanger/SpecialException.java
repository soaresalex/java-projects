// SpecialException.java
// THis will display a special exception when the user enters a non-integer.

package colorchanger;

public class SpecialException extends Exception
{
    public SpecialException() {
        super("The input is not in the range of 1-3. Please reenter.");
    }
}