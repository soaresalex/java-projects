// Rectange.java

package rectangle;

public class Rectangle extends Line1 {
    
    private double width;
    private double height;
    
    public Rectangle()
    {
        // implicit call to Rectange constructor occurs here
    }
    
    // constructor
    public Rectangle(int xValue, int yValue, int wValue, int zValue, int sValue, int tValue)
    {
        super(xValue, yValue, wValue, zValue, sValue, tValue);
    }
    
    // get rectangle's height
    public int getHeight()
    {
        return super.getLine2();
    }
    
    // get rectangle's width
    public int getWidth()
    {
        return super.getLine1();
    }
    
    // get the area of the rectangle
    public int getArea()
    {
        return getHeight() * getWidth();
    }
    
    // get the perimeter of the rectangle
    public int getPerimeter()
    {
        return (getHeight() * 2) + (getWidth() * 2);
    }
    
    public String toString()
    {
        return super.toString() + "\nHeight = " + getHeight() + "\nWidth = " + getWidth();
    }
}
