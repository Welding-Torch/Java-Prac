import java.util.*;
interface Shape
{
    public void area(float l , float b);
    public void perimeter(float l, float b);
}
class Circle implements Shape{
    public void area(float r,float r1)
    {
	System.out.println("The area of circle is "+(3.14*r*r1));
    }
    public void perimeter(float r,float r1)
    {
	System.out.println("The perimeter of circle is "+(3.14*2*r));
    }
}
class Rectangle implements Shape
{
    public void area(float l,float b)
    {
	System.out.println("The area of rectangle is "+(l*b));
    }
    public void perimeter(float l,float b)
    {
	System.out.println("The perimeter of rectangle is "+(2*(l+b)));
    }
}

class Sample
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter the radius of the circle");
       float r = sc.nextFloat();
       Circle ob = new Circle();
	ob.area(r,r);
	ob.perimeter(r,0);
       System.out.println("Enter the length and breadth of the Rectangle");
       float l = sc.nextFloat();
       float b = sc.nextFloat();
       Rectangle ob1 = new Rectangle();
	ob1.area(l,b);
	ob1.perimeter(l,b);
   }
}
