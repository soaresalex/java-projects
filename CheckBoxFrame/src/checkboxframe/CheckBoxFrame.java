// CheckBoxFrame.java
// JCheckBoxes and item events

package checkboxframe;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame
{
    private final JTextField textField; // displays text in changing fonts
    private final JCheckBox boldJCheckBox; // to select/diselect bold
    private final JCheckBox italicJCheckBox; // to select/diselect italic
    
    // CheckBoxFrame constructor adds JCheckBoxes to JFrame
    public CheckBoxFrame()
    {
        super("JCheckBox Test");
        setLayout(new FlowLayout());
        
        // set up JTextField and set its font
        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField); // add textField to JFrame
        
        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");
        add(boldJCheckBox); // add bold checkbox to JFrame
        add(italicJCheckBox); // italic checkbox to JFrame
        
        // register listeners for JCheckBoxes
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
    }
    
    // private inner class for ItemListener event handling
    private class CheckBoxHandler implements ItemListener
    {
        // respond to checkbox events
        @Override
        public void itemStateChanged(ItemEvent event)
        {
            Font font = null; // stores the new Font
            
            // determine which CheckBoxes are checked and create font
            if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            else if (boldJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if (italicJCheckBox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font = new Font("Serif", Font.PLAIN, 14);
            
            textField.setFont(font);
        }
    }
} // end class CheckBoxFrame