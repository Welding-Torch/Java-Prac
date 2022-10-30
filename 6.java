import java.util.*;
class Area{
    float length;
    float breadth;
    void calarea()
    {
	length=0;
	breadth=0;
    }
    void calarea(float l,float b)
    {
	System.out.println("The area of rectangle is "+(l*b));
    }
    void calarea(float l)
    {
	System.out.println("The area of square is "+(l*l));
    }
}
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
	Area ob = new Area();
	System.out.println("Enter the length and breadth of the rectangle");
	float l= sc.nextFloat();
	float b= sc.nextFloat();
	ob.calarea(l,b);
	System.out.println("Enter the side of Square");
	float s= sc.nextFloat();
	ob.calarea(s);
    }
}