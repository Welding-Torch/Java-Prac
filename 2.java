import java.util.*;
class Area{
    public float returnArea(float l,float b)
    {
	return l*b;
    }
}
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
	Area ob = new Area();
        System.out.println("Enter the length and breadth");
	float l = sc.nextFloat();
	float b = sc.nextFloat();
	float area = ob.returnArea(l,b);
	System.out.println("Area of rectangle is "+area);
    }
}