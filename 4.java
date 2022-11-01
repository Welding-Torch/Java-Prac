import java.util.*;
class Sports{
    float score;
    public void putScore(float b)
    {
	score=b;
    }
}
class Marks extends Sports
{
    float marks;
    public void putMarks(float b)
    {
	marks=b;
    }
}

class Student extends Marks 
{
    int rollno;
    public void putNo(int b)
    {
	rollno=b;
    }
}
public class Main{
    public static void main(String[] args)
    {
	int j;
    Scanner sc = new Scanner (System.in);
	//System.out.println("Enter the number of students");
	//int i = sc.nextInt();
	Student ob =new Student();
	System.out.print("Enter the rollno of student :");
	int rn = sc.nextInt();
    System.out.print("Enter the marks of student :");
    float m = sc.nextFloat();
    System.out.print("Enter the Score of student :");
    float s = sc.nextInt();
    ob.putScore(s);
	ob.putMarks(m);
	ob.putNo(rn);
    System.out.println("ROLL NO\tMARKS\tSCORE");
    System.out.println(ob.rollno+"\t"+ob.marks+"\t"+ob.score);
    }
}