import java.util.*;
class Account{
    float balance;
}
class SavingsAccount extends Account
{
    float interest;
    SavingsAccount(float f)
    {
	interest =f;
    }
    public float addinterst(float b)
    {
	balance= b + (b*(interest/100));
	return balance;
    }
}

class CurrentAccount extends Account
{
    float interest;
    CurrentAccount(float f)
    {
	interest =f;
    }
    public float addinterst(float b)
    {
	balance= b + (b*(interest/100));
	return balance;
    }
}
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
	System.out.println("Enter the balance in your account");
	float f = sc.nextFloat();
	System.out.println("Enter the interest you recieve in %");
	float i =sc.nextFloat();
	SavingsAccount ob = new SavingsAccount(i);
	CurrentAccount ob1 = new CurrentAccount(i);
	float b = ob.addinterst(f);
	System.out.println("New balance in Savings Account is "+b);
	b= ob1.addinterst(f);
	System.out.println("New balance in Current Account is "+b);
    }

}