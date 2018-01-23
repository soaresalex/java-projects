// Point.java

package point;

public class Point {
  public int x; // x part of coordinate pair
  private int y; // y part of coordinate pair
  
  // constsructor
  public Point(int xValue, int yValue)
  {
     // implicit call to Object constructor occurs here
     x = xValue;  // no need for validation
     y = yValue;  // no need for validation
  }

  // set x in coordinate pair
  public void setX(int xValue)
  {
     x = xValue;  // no need for validation
  }

  // return x from coordinate pair
  public int getX()
  {
     return x;
  }

  // set y in coordinate pair
  public void setY(int yValue)
  {
     y = yValue;  // no need for validation
  }

  // return y from coordinate pair
  public int getY()
  {
     return y;
  }

  // return String representation of Point object
  public String toString()
  {
     return "[" + x + ", " + y + "]";
  }

} // end class Point
