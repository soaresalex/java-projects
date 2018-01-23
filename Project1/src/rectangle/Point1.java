// Point.java

package rectangle;

public class Point1 {
  private int x; // x part of coordinate pair
  private int y; // y part of coordinate pair
  private int w; // w part of coordinate pair
  private int z; // z part of coordinate pair
  private int s; // s part of coordinate pair
  private int t; // t part of coordinate pair
  
  // no-argument constructor
   public Point1()
   {
      // implicit call to Object constructor occurs here
   }
  
  // constsructor
  public Point1(int xValue, int yValue, int wValue, int zValue, int sValue, int tValue)
  {
     // implicit call to Object constructor occurs here
     x = xValue;
     y = yValue;
     w = wValue;
     z = wValue;
     s = sValue;
     t = tValue;
     
  }

  // set x in coordinate pair
  public void setX(int xValue)
  {
     x = xValue;
  }

  // return x from coordinate pair
  public int getX()
  {
     return x;
  }

  // set y in coordinate pair
  public void setY(int yValue)
  {
     y = yValue;
  }

  // return y from coordinate pair
  public int getY()
  {
     return y;
  }
  
  // set w in coordinate pair
  public void setW(int wValue)
  {
      w = wValue;
  }
  
  // return w from coordinate pair
  public int getW()
  {
      return w;
  }
  
  // set z from coordinate pair
  public void setZ(int zValue)
  {
      z = zValue;
  }
  
  // return z from coordinate pair
  public int getZ()
  {
      return z;
  }
  
   // set z from coordinate pair
  public void setS(int sValue)
  {
      s = sValue;
  }
  
  // return z from coordinate pair
  public int getS()
  {
      return s;
  }
  
   // set z from coordinate pair
  public void setT(int tValue)
  {
      t = tValue;
  }
  
  // return z from coordinate pair
  public int getT()
  {
      return t;
  }

  // return String representation of Point object
  public String toString()
  {
     return "[" + getX() + ", " + getZ() + "]" + "\n[" + getW() + ", " + getZ() + "]" +
             "\n[" + getS() + ", " + getT() + "]";
  }

} // end class Point
