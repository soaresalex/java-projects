// Line.java

package rectangle;

public class Line1 extends Point1
{
    private int line1;
    private int line2;
    
    // no-argument constructor
   public Line1()
   {
      // implicit call to Point3 constructor occurs here
   }
   
   // constructor
   public Line1(int xValue, int yValue, int wValue, int zValue, int sValue, int tValue)
   {
       super(xValue, yValue, wValue, zValue, sValue, tValue);
   }
   
   // get line 1
   public int getLine1()
   {
       /*if(getY() != getZ())
           throw new IllegalArgumentException("Y and Z must be the same value");*/
       
       if(getX() > getW())
           return line1 = getX() - getW();
       else
           return line1 = getW() - getX();
   }
   
   // get line 2
   public int getLine2()
   {
       if(getX() != getS())
           throw new IllegalArgumentException("X and S must be the same value");
       
       if(getY() > getT())
           return line2 = getY() - getT();
       else
           return line2 = getT() - getY();
   }
   
   // return String representation of Line1 object
   public String toString()
   {
       return super.toString() + "Line 1 is " + getLine1() + "\nLine2 is " + getLine2();
   }
}
