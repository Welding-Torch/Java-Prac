import java.util.*;
import java.io.*;
import java.lang.*;
public class Main3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name,temp,result="";
	char in;
        System.out.println("Enter your full Name");
        name = sc.nextLine();
        temp = name.substring(0,(name.indexOf(" ")-1));
        name = name.substring(name.indexOf(" ")+1);
	System.out.println(temp+" |"+name);
        in= temp.charAt(0);
        result = result.concat(Character.toUpperCase(in)+".");
        temp = name.substring(0,(name.indexOf(" ")-1));
        name = name.substring(name.indexOf(" ")+1);
	System.out.println(temp+"  |"+name);
        in= temp.charAt(0);
        result = result.concat(Character.toUpperCase(in)+".");
        result = result.concat(name);
        System.out.println(result);
    }
}