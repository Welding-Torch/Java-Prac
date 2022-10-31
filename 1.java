import java.util.*;
class Employee {
    String name;
    int yoj;
    String address;
    Employee(String n, int y , String a){
        this.name= n;
        this.yoj=y;
        this.address=a;
    }
    public void display()
    {
	System.out.println(name+"\t     "+yoj+"\t    "+address);
    }
}
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int i;
        System.out.println("Enter the number of entries you want to make");
        int c = sc.nextInt();
        Employee[] ob = new Employee[c];//array of objects is optional i was getting bored
        for(i =0;i<c;i++ )
        {
            System.out.print("Enter the name of the employee: ");
            String n = sc.next();
            System.out.println("Enter the year of joining: ");
            int y = sc.nextInt();
            System.out.println("Enter the address of the employee: ");
            String a = sc.next();
            ob[i] = new Employee(n,y,a);
        }
        System.out.println("NAME\tYEAR OF JOINING\tADDRESS");
        for(i=0;i<c;i++)
        {
            ob[i].display();
        }

    }

}