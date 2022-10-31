// Java Program to Handle Divide By Zero Exception
import java.io.*;
class Q12a {
public static void main(String[] args) {
int a = 5;
int b = 0;
try {
System.out.println(a / b); // throw Exception
} catch (ArithmeticException e) {
// Exception handler
System.out.println("Divided by zero operation cannot possible");
}
}
}