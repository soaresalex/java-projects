// KeyDemoTest.java
// Testing KeyDemoFrame.

package keydemo;

import javax.swing.JFrame;

public class KeyDemoTest
{
    public static void main(String[] args)
    {
        KeyDemoFrame keyDemoFrame = new KeyDemoFrame();
        keyDemoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        keyDemoFrame.setSize(350, 100);
        keyDemoFrame.setVisible(true);
    }
} // end class KeyDemo