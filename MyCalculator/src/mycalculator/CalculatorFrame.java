// calculatorFrame
package mycalculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame
{
    private final JPanel outputPanel, inputPanel, symbolPanel;
    private final JButton[] buttons, symbols;
    private final JTextField outputTextField;
    private static final String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "=" };
    private static final String[] symbol = { "+", "-", "x", "/" };
    private final FlowLayout layout;
    private final Container container;
    private int sum, input1, input2;
    
    public CalculatorFrame()
    {
        super("My Calculator");
        layout= new FlowLayout();
        container = getContentPane();
        container.setBackground(new Color(99, 100, 102));
        setLayout(layout);
        Box box = Box.createHorizontalBox();
        
        // create output panel with textfield
        outputPanel = new JPanel();
        outputPanel.setLayout(new GridLayout(1, 1));
        outputPanel.setBackground(new Color(99, 100, 102));
        outputPanel.setPreferredSize(new Dimension(350, 60));
        add(outputPanel);
        outputTextField = new JTextField(22);
        outputTextField.setBackground(new Color(99, 100, 102));
        outputTextField.setBorder(BorderFactory.createLineBorder(new Color(99, 100, 102)));
        outputPanel.add(outputTextField);
        
        // create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        
        // create numbers panel
        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 3, 0, 0));
        inputPanel.setPreferredSize(new Dimension(270, 270));
        inputPanel.setBackground(new Color(99, 100, 102));
        box.add(inputPanel);
        buttons = new JButton[numbers.length];
        for (int count = 0; count < numbers.length; count++) {
            buttons[count] = new JButton(numbers[count]);
            buttons[count].setBackground(new Color(99, 100, 102));
            buttons[count].setForeground(Color.WHITE);
            buttons[count].setOpaque(true);
            buttons[count].setBorderPainted(true);
            buttons[count].setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            inputPanel.add(buttons[count]);
            buttons[count].addActionListener(handler);
        }
        
        // create math buttons and panels
        symbolPanel = new JPanel();
        symbolPanel.setLayout(new GridLayout(4, 1));
        symbolPanel.setPreferredSize(new Dimension(90, 270));
        symbolPanel.setBackground(Color.BLACK);
        box.add(symbolPanel);
        symbols = new JButton[symbol.length];
        for (int count = 0; count < symbol.length; count++) {
            symbols[count] = new JButton(symbol[count]);
            symbols[count].setBackground(new Color(231, 147, 93));
            symbols[count].setForeground(Color.BLACK);
            symbols[count].setOpaque(true);
            symbols[count].setBorderPainted(true);
            symbols[count].setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
            symbolPanel.add(symbols[count]);
            symbols[count].addActionListener(handler);
        }
        add(box);
    }
    
    // add button event handling
    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            switch (input1) {
                case 1:
                    
            }
        }
    }
}