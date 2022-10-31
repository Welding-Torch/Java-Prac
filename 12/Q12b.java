// Java Program to Handle multiple exception
import java.io.*;
class Q12b {
    public static void main(String[] args)
    {
        try {
            int number[] = new int[20];
            number[21] = 30 / 9;
            // this statement will throw
            // ArrayIndexOutOfBoundsException e
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e.getMessage());
            // print the message
        }
    }
}