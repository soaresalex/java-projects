// Cylinder.java
package cylinder;

public class Cylinder extends Circle4 {
   private double height;  // Cylinder's height

   // no-argument constructor
   public Cylinder()
   {
      // implicit call to Circle4 constructor occurs here
   }

   // constructor
   public Cylinder(int xValue, int yValue, double radiusValue, double heightValue)
   {
      super( xValue, yValue, radiusValue ); // call Circle4 constructor
      setHeight(heightValue);
   }

   // set Cylinder's height
   public void setHeight(double heightValue)
   {
      height = (heightValue < 0.0 ? 0.0 : heightValue);
   }

   // get Cylinder's height
   public double getHeight()
   {
      return height;
   }

   // override Circle4 method getArea to calculate Cylinder area
   public double getArea()
   {
      return 2 * super.getArea() + getCircumference() * getHeight();
   }

   // calculate Cylinder volume
   public double getVolume()
   {
      return super.getArea() * getHeight();
   }

   // return String representation of Cylinder object
   public String toString()
   {
      return super.toString() + "; Height = " + getHeight();
   }

} // end class Cylinder