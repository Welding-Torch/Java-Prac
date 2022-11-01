// import Emp.*;
import java.util.*;
class Emppay
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       String name,empid,category;
       float bpay,hra,da,npay,pf,grosspay,allowance;
       System.out.print("Enter the name of the Employee: ");
       name=sc.next();
       System.out.print("Enter the id of the Employee: ");
       empid=sc.next();
       System.out.print("Enter the category the Employee falls into(nc/sc/ssc): ");
       category=sc.next();
       System.out.print("Enter the Basic pay the employee gets:");
       bpay=sc.nextFloat();
       System.out.print("Enter the House rental allowance the employee gets:");
       hra=sc.nextFloat();
       System.out.print("Enter the Dearness allowance the employee gets:");
       da=sc.nextFloat();
       System.out.print("Enter the Allowance the employee gets:");
       allowance=sc.nextFloat();
       Emp ob = new Emp(name, empid, category, bpay, hra, da, allowance);
       ob.getGross();
       ob.calTax();
       ob.getNet();
       System.out.println("NAME\tID\tCATEGORY\tBASIC PAY\tHRA\tDA\tALLOWANCE\tGROSSPAY\tINCOMETAX\tNETPAY\tPF");
       System.out.println(ob.name+"\t"+ob.empid+"\t"+ob.category+"\t"+ob.bpay+"\t"+ob.hra +"\t"+ob.da+"\t"+ob.allowance+"\t"+ob.grosspay+"\t"+ob.incometax+"\t"+ob.npay+"\t"+ob.pf);
   }
}