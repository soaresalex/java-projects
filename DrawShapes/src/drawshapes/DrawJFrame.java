
package drawshapes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DrawJFrame extends JFrame
{
    private final JRadioButton ovalRadioButton;
    private final JRadioButton rectangleRadioButton;
    private final JRadioButton lineRadioButton;
    private final ButtonGroup shapesGroup;
    private final JPanel shapesPanel;
    private final JPanel colorsPanel;
    private JPanel drawPanel;
    private final JComboBox colorComboBox;
    private final int BLACK = 0;
    private final int RED = 1;
    private final int BLUE = 2;
    private final int GREEN = 3;
    private int colorChoice;
    private Color color = Color.RED;
    private final JCheckBox fillCheckBox;
    private final JLabel fillLabel;
    private Point pointPressed;
    private Point pointReleased;
    private Point pointDragged;
    
    public DrawJFrame()
    {
        super("Drawing Shapes");
        
        // create panels
        shapesPanel = new JPanel();
        add(shapesPanel, BorderLayout.NORTH);
        colorsPanel = new JPanel();
        add(colorsPanel, BorderLayout.SOUTH);
        drawPanel = new JPanel();
        drawPanel.setBackground(Color.WHITE);
        add(drawPanel, BorderLayout.CENTER);
        
        // create radio buttons
        ovalRadioButton = new JRadioButton("Oval", true);
        rectangleRadioButton = new JRadioButton("Rectangle", false);
        lineRadioButton = new JRadioButton("Line", false);
        shapesPanel.add(ovalRadioButton);
        shapesPanel.add(rectangleRadioButton);
        shapesPanel.add(lineRadioButton);
        
        // create logical relationship between radio buttons
        shapesGroup = new ButtonGroup();
        shapesGroup.add(ovalRadioButton);
        shapesGroup.add(rectangleRadioButton);
        shapesGroup.add(lineRadioButton);
        
        // create color ComboBox
        colorComboBox = new JComboBox();
        colorComboBox.addItem("Black");
        colorComboBox.addItem("Red");
        colorComboBox.addItem("Blue");
        colorComboBox.addItem("Green");
        colorComboBox.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent e)
                    {
                        colorChoice = colorComboBox.getSelectedIndex();
                        repaint();
                    }
                }
        );
        colorsPanel.add(colorComboBox);
        
        // create label and checkbox
        fillLabel = new JLabel("Fill?");
        fillCheckBox = new JCheckBox();
        colorsPanel.add(fillLabel);
        colorsPanel.add(fillCheckBox);
        
        // create and register listener for mouse and mouse motion events
        MouseHandler handler = new MouseHandler();
        drawPanel.addMouseListener(handler);
        drawPanel.addMouseMotionListener(handler);
    }
    
    // create mouse handler
    private class MouseHandler extends MouseAdapter implements MouseListener, MouseMotionListener
    {
        @Override
        public void mouseClicked(MouseEvent e)
        {
            e.getLocationOnScreen();
        }
        
        @Override
        public void mousePressed(MouseEvent e)
        {
             pointPressed = e.getLocationOnScreen();
        }
        
        @Override
        public void mouseReleased(MouseEvent e)
        {
            pointReleased = e.getLocationOnScreen();
        }
        
        @Override
        public void mouseEntered(MouseEvent e)
        {
            e.getLocationOnScreen();
        }
        
        @Override
        public void mouseExited(MouseEvent e)
        {
            e.getLocationOnScreen();
        }
        
        @Override
        public void mouseDragged(MouseEvent e)
        {
            pointDragged = e.getLocationOnScreen();
            repaint();
        }
        
        @Override
        public void mouseMoved(MouseEvent e)
        {
            e.getLocationOnScreen();
        }
    }
    
    @Override
    public void paint(Graphics g)
    {
        super.paintComponents(g);
        
        if(fillCheckBox.isSelected()) {
            if(ovalRadioButton.isSelected()){
                g.setColor(color);
                g.fillOval(pointPressed.x, pointPressed.y, Math.abs(pointPressed.x - pointDragged.x),
                        Math.abs(pointPressed.y - pointDragged.y));
            } else if(rectangleRadioButton.isSelected()){
                g.setColor(color);
                g.fillRect(pointPressed.x, pointPressed.y, Math.abs(pointPressed.x - pointDragged.x),
                        Math.abs(pointPressed.y - pointDragged.y));
            } else if(lineRadioButton.isSelected()){
                g.setColor(color);
                g.drawLine(pointPressed.x, pointPressed.y, pointDragged.x, pointDragged.y);
            }
        } else if(fillCheckBox.isSelected() == false) {
            if(ovalRadioButton.isSelected()){
                g.setColor(color);
                g.drawOval(pointPressed.x, pointPressed.y, Math.abs(pointPressed.x - pointDragged.x),
                        Math.abs(pointPressed.y - pointDragged.y));
            } else if(rectangleRadioButton.isSelected()){
                g.setColor(color);
                g.drawRect(pointPressed.x, pointPressed.y, Math.abs(pointPressed.x - pointDragged.x),
                        Math.abs(pointPressed.y - pointDragged.y));
            } else if(lineRadioButton.isSelected()){
                g.setColor(color);
                g.drawLine(pointPressed.x, pointPressed.y, pointDragged.x, pointDragged.y);
            }
        }
        
        // color selection for shapes
        switch (colorChoice)
        {
            case BLACK:
                color = Color.BLACK;
                break;
            case RED:
                color = Color.RED;
                break;
            case BLUE:
                color = Color.BLUE;
                break;
            case GREEN:
                color = Color.GREEN;
                break;
        }
    }
}