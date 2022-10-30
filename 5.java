import java.util.*;
class Rectangle{
    float length;
    float breadth;
    Rectangle()
    {
	length=0;
	breadth=0;
    }
    Rectangle(float l,float b)
    {
	length=l;
	breadth=b;
    }
    Rectangle(float l)
    {
	length=l;
	breadth=l;
    }
    public float area()
    {
	return length*breadth;
    }
}
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
	Rectangle ob = new Rectangle();
	System.out.println("The area of rectangle is "+ob.area());
	System.out.println("Enter the length and breadth");
	float l= sc.nextFloat();
	float b= sc.nextFloat();
	Rectangle ob1 = new Rectangle(l,b);
	System.out.println("The area of rectangle is "+ob1.area());
	System.out.println("Enter the side of Square");
	float s= sc.nextFloat();
	Rectangle ob2 = new Rectangle(s);
	System.out.println("The area of square is "+ob2.area());
    }
}
