// MouseTrackerFrameTest.java
// Testing MouseTrackerFrame.

package mousetracker;

import javax.swing.JFrame;

public class MouseTrackerFrameTest
{
    public static void main(String[] args)
    {
        MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(300, 100);
        mouseTrackerFrame.setVisible(true);
    }
} // end class MouseTracker
