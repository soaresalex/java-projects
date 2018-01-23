// LinesRectsOvals.java
// Testing LinesRectsOvalsJPanel

package linesrectsovalsjpanel;

import java.awt.Color;
import javax.swing.JFrame;

public class LinesRectsOvals
{
    // execute application
    public static void main(String[] args)
    {
        // create frame for LinesRectOvalsJPanels
        JFrame frame =
                new JFrame("Drawing lines, rectangles and ovals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        LinesRectsOvalsJPanel linesRectsOvalsJPanel =
                new LinesRectsOvalsJPanel();
        linesRectsOvalsJPanel.setBackground(Color.WHITE);
        frame.add(linesRectsOvalsJPanel);
        frame.setSize(400, 210);
        frame.setVisible(true);
    }
} // end class LinesRectsOvals
