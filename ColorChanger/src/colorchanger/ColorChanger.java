// ColorChanger.java

package colorchanger;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class ColorChanger extends JFrame
{
    private final JTextField colorTextField;
    private final JLabel colorLabel;
    private final JPanel inputPanel;
    private final JPanel displayPanel;
    private int userInt;
    private String input;
    private int num;
    //private int num;
    
    public ColorChanger()
    {
        super("Color Changer");
        
        // create panel to add label and textfield
        inputPanel = new JPanel();
        inputPanel.setBackground(Color.WHITE);
        add(inputPanel, BorderLayout.SOUTH);
        
        // create panel to display color
        displayPanel = new JPanel();
        displayPanel.setBackground(Color.GREEN);
        add(displayPanel, BorderLayout.CENTER);
        
        // create label
        colorLabel = new JLabel("Enter number");
        inputPanel.add(colorLabel);
        
        // create JTextField and converts the input from string to integer
        colorTextField = new JTextField(15);
        inputPanel.add(colorTextField);
        
        // register event handler
        TextFieldHandler handler = new TextFieldHandler();
        colorTextField.addActionListener(handler);
    }
    
    public int getInt() throws NumberFormatException, SpecialException {
        num = Integer.parseInt(colorTextField.getText()); // converts string to integer
        if (num > 3 || num < 1)
            throw new SpecialException();
        return num;
    }
    
    private class TextFieldHandler implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent evt)
        {
            try
            {
                userInt = getInt();
                String text = evt.getActionCommand();
                switch (text) {
                    case "1":
                        displayPanel.setBackground(Color.RED);
                        break;
                    case "2":
                        displayPanel.setBackground(Color.BLUE);
                        break;
                    case "3":
                        displayPanel.setBackground(Color.YELLOW);
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                // display error pop-up if non-integer entered
                JOptionPane.showMessageDialog(rootPane, "The input must be an integer. Please reenter.");
            } catch (SpecialException e) {
                // display error pop-up if number is greater than 3 and less than 1
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            } finally {
                repaint();
            }
        }
    }
}
