// VendingMachineFrame.java

package vendingmachine;


import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Color;
import java.awt.Font;

public class VendingMachineFrame extends JFrame
{
    private final JButton soda1Button;
    private final JButton soda2Button;
    private final JButton soda3Button;
    private final JButton soda4Button;
    private final JButton waterButton;
    private final JButton water2Button;
    private final JButton candy1Button;
    private final JButton candy2Button;
    private final JButton candy3Button;
    private final JButton potatoChips1Button;
    private final JButton potatoChips2Button;
    private final JButton potatoChips3Button;
    private final JButton nickelButton;
    private final JButton dimeButton;
    private final JButton quarterButton;
    private final JButton dollarButton;
    private final JTextField payment;
    private final JLabel amountInsertedLabel;
    private final JPanel panel1;
    private final JPanel panel2;
    private final JPanel panel3;
    private final FlowLayout layout;
    private final Container container;
    double paymentAmount;
    double paymentToString;
    String item;
    
    
    public VendingMachineFrame()
    {
        super("Vending Machine");
        layout = new FlowLayout();
        container = getContentPane(); // get container to layout
        container.setBackground(new Color(255, 102, 102));
        setLayout(layout);
        Box box = Box.createHorizontalBox();
        
        Icon candy1 = new ImageIcon(getClass().getResource("candy.png"));
        Icon candy2 = new ImageIcon(getClass().getResource("candy2.png"));
        Icon candy3 = new ImageIcon(getClass().getResource("candy3.png"));
        Icon soda1 = new ImageIcon(getClass().getResource("soda1.png"));
        Icon soda2 = new ImageIcon(getClass().getResource("soda2.png"));
        Icon soda3 = new ImageIcon(getClass().getResource("soda3.png"));
        Icon soda4 = new ImageIcon(getClass().getResource("soda4.png"));
        Icon water = new ImageIcon(getClass().getResource("water.png"));
        Icon water2 = new ImageIcon(getClass().getResource("water2.png"));
        Icon potatoChips1 = new ImageIcon(getClass().getResource("potatochips1.png"));
        Icon potatoChips2 = new ImageIcon(getClass().getResource("potatochips2.png"));
        Icon potatoChips3 = new ImageIcon(getClass().getResource("potatochips3.png"));
        Icon dollar = new ImageIcon(getClass().getResource("dollar.png"));
        Icon nickel = new ImageIcon(getClass().getResource("nickel.png"));
        Icon dime = new ImageIcon(getClass().getResource("dime.png"));
        Icon quarter = new ImageIcon(getClass().getResource("quarter.png"));
        
        panel3 = new JPanel();
        panel3.setPreferredSize(new Dimension(575, 50));
        panel3.setBackground(new Color(255, 102, 102));
        add(panel3);
        amountInsertedLabel = new JLabel("Remaining Amount");
        amountInsertedLabel.setForeground(Color.WHITE);
        amountInsertedLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        panel3.add(amountInsertedLabel);
        payment = new JTextField(25);
        payment.setEditable(false);
        panel3.add(payment);
        
        // Money selection
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(4, 1, 5, 5));
        panel2.setBackground(new Color(50, 153, 153));
        box.add(panel2);
        nickelButton = new JButton("$0.05", nickel);
        panel2.add(nickelButton);
        dimeButton = new JButton("$0.10", dime);
        panel2.add(dimeButton);
        quarterButton = new JButton("$0.25", quarter);
        panel2.add(quarterButton);
        dollarButton = new JButton("$1.00", dollar);
        panel2.add(dollarButton);
        
        // Vending Machine food selection
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4, 3, 5, 5));
        panel1.setPreferredSize(new Dimension(400, 400));
        panel1.setBackground(new Color(255, 102, 102));
        box.add(panel1);
        soda1Button = new JButton("$1.00", soda1);
        panel1.add(soda1Button);
        soda2Button = new JButton("$1.00", soda2);
        panel1.add(soda2Button);
        soda3Button = new JButton("$1.00", soda3);
        panel1.add(soda3Button);
        soda4Button = new JButton("$1.50", soda4);
        panel1.add(soda4Button);
        waterButton = new JButton("$1.25", water);
        panel1.add(waterButton);
        water2Button = new JButton("$1.25", water2);
        panel1.add(water2Button);
        candy1Button = new JButton("$0.75", candy1);
        panel1.add(candy1Button);
        candy2Button = new JButton("$0.50", candy2);
        panel1.add(candy2Button);
        candy3Button = new JButton("$0.75", candy3);
        panel1.add(candy3Button);
        potatoChips1Button = new JButton("$0.65", potatoChips1);
        panel1.add(potatoChips1Button);
        potatoChips2Button = new JButton("$0.65", potatoChips2);
        panel1.add(potatoChips2Button);
        potatoChips3Button = new JButton("$0.65", potatoChips3);
        panel1.add(potatoChips3Button);
        
        ButtonHandler handler = new ButtonHandler();
        soda1Button.addActionListener(handler);
        soda2Button.addActionListener(handler);
        soda3Button.addActionListener(handler);
        soda4Button.addActionListener(handler);
        waterButton.addActionListener(handler);
        water2Button.addActionListener(handler);
        candy1Button.addActionListener(handler);
        candy2Button.addActionListener(handler);
        candy3Button.addActionListener(handler);
        potatoChips1Button.addActionListener(handler);
        potatoChips2Button.addActionListener(handler);
        potatoChips3Button.addActionListener(handler);
        nickelButton.addActionListener(handler);
        dimeButton.addActionListener(handler);
        quarterButton.addActionListener(handler);
        dollarButton.addActionListener(handler);
        
        add(box);
    }
    
    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {   
            // select the snack of your choice
            if(event.getSource() == soda1Button)
            {
                item = "can of soda";
                paymentAmount = 1.00;   
            } else if(event.getSource() == soda2Button)
            {
                item = "can of soda";
                paymentAmount = 1.00;
            } else if(event.getSource() == soda3Button)
            {
                item = "can of soda";
                paymentAmount = 1.00;
            } else if(event.getSource() == soda4Button)
            {
                item = "bottle of soda";
                paymentAmount = 1.50;
            } else if (event.getSource() == waterButton)
            {
                item = "bottle of water";
                paymentAmount = 1.25;
            } else if(event.getSource() == water2Button)
            {
                item = "bottle of water";
                paymentAmount = 1.25;
            } else if(event.getSource() == candy1Button)
            {
                item = "candy";
                paymentAmount = 0.75;
            } else if(event.getSource() == candy2Button)
            {
                item = "candy";
                paymentAmount = 0.50;
            } else if(event.getSource() == candy3Button)
            {
                item = "lollipop";
                paymentAmount = 0.75;
            }else if(event.getSource() == potatoChips1Button)
            {
                item = "bag of potato chips";
                paymentAmount = 0.65;
            }else if(event.getSource() == potatoChips2Button)
            {
                item = "bag of potato chips";
                paymentAmount = 0.65;
            } else if(event.getSource() ==  potatoChips3Button)
            {
                item = "bag of potato chips";
                paymentAmount = 0.65;
            }
            
            // the amount of money inserted into machine
            if(event.getSource() ==  nickelButton && paymentAmount >= 0.05)
                paymentAmount = paymentAmount - 0.05;
            if(event.getSource() == dimeButton && paymentAmount >= 0.10)
                paymentAmount = paymentAmount - 0.10;
            if(event.getSource() == quarterButton && paymentAmount >= 0.25)
                paymentAmount = paymentAmount - 0.25;
            if(event.getSource() == dollarButton && paymentAmount >= 1.00)
                paymentAmount = paymentAmount - 1.00;
            
            paymentToString = paymentAmount;
            String paymentString = String.format("%.2f", paymentToString);
            payment.setText("$" + paymentString);
            
            if("0.00".equals(paymentString) || "0".equals(paymentString) || "0.0".equals(paymentString))
                JOptionPane.showMessageDialog(null, "Enjoy your " + item + "!");
        }
    }
}
