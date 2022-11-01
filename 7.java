import java.util.*;
class Member{
    String name,address;
    int age;
    float salary;
    long phoneno;
    void printsal()
    {
	System.out.println("The Member's salary is "+salary);
    }
}
class Employee extends Member
{
     String spel;
     Employee(String n,String ad,int ag,float sal,long ph,String spe)
     {
	name=n;
	address=ad;
	age=ag;
	salary=sal;
	phoneno=ph;
	spel=spe;
     }
}
class Manager extends Member
{
     String dept;
     Manager(String n,String ad,int ag,float sal,long ph,String dep)
     {
	name=n;
	address=ad;
	age=ag;
	salary=sal;
	phoneno=ph;
	dept=dep;
     }
}
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Name of the Employee");
	String n = sc.next();
	System.out.println("Enter the age of the Employee");
	int ag = sc.nextInt();
	System.out.println("Enter the Phone number the Employee");
	long ph = sc.nextLong();
	System.out.println("Enter the address of the Employee");
	String ad = sc.next();
	System.out.println("Enter the salary of the Employee");
	float sal = sc.nextFloat();
	System.out.println("Enter the specialization of the Employee");
	String spe = sc.next();
	Employee ob = new Employee(n,ad,ag,sal,ph,spe);

	System.out.println("Enter the Name of the Manager");
	n = sc.next();
	System.out.println("Enter the age of the Manager");
	ag = sc.nextInt();
	System.out.println("Enter the Phone number the Manager");
	ph = sc.nextLong();
	System.out.println("Enter the address of the Manager");
	ad = sc.next();
	System.out.println("Enter the salary of the Manager");
	sal = sc.nextFloat();
	System.out.println("Enter the department of the Manager");
	spe = sc.next();
	Manager ob1 = new Manager(n,ad,ag,sal,ph,spe);

	System.out.println("NAME\tAGE\tPHONE NO\tADDRESS\tSPECIALIZATION\\DEPARTMENT");//optional i love aesthetics so tehee
	System.out.println(ob.name+"\t"+ob.age+"\t"+ob.phoneno+"\t"+ob.address+"\t"+ob.spel);
	System.out.println(ob1.name+"\t"+ob1.age+"\t"+ob1.phoneno+"\t"+ob1.address+"\t"+ob1.dept);
	ob.printsal();
	ob1.printsal();
    }
}