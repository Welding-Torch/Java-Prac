import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name,temp,result="";
	    char in; //in means Initial
        System.out.println("Enter your full Name");
        name = sc.nextLine(); //name = Sachin Ramesh Tendulkar
        temp = name.substring(0, (name.indexOf(" ")-1)); // temp = Starts at '0' and ends at 'first space - 1'.
        name = name.substring(name.indexOf(" ") + 1); //name = Ramesh Tendulkar
	    System.out.println(temp+" |"+name); //Sachi |Ramesh Tendulkar
        in = temp.charAt(0); //in = S
        result = result.concat(Character.toUpperCase(in) + "."); // result = S.
        temp = name.substring(0, (name.indexOf(" ")-1)); //temp = Ramesh
        name = name.substring(name.indexOf(" ") + 1); //name = Tendulkar
	    System.out.println(temp+"  |"+name); //Rame  |Tendulkar
        
        in= temp.charAt(0);
        result = result.concat(Character.toUpperCase(in) + "."); // result = S.R.
        
        result = result.concat(name); // result = S.R.Tendulkar
        System.out.println(result);
        
    }
}

// This program uses methods like substring, indexOf, charAt, concat, toUpperCase, etc.