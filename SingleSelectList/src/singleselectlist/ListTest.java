// ListTest.java
// Selecting color from a JList.

package singleselectlist;

import javax.swing.JFrame;

public class ListTest
{
    public static void main(String[] args)
    {
        ListFrame listFrame = new ListFrame(); // create ListFrame
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listFrame.setSize(350, 150);
        listFrame.setVisible(true);
    }
} // end class ListTest