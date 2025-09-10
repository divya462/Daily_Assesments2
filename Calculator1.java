/*
2. Create a program that simulates a simple calculator using command-line arguments to perform and print the result of addition, subtraction, multiplication, and division..
*/

import java.util.Scanner;
class Calculator {
  public static void main(String[] a) {
    Scanner sc=new Scanner(System.in);
    double x=sc.nextDouble();
    double y=sc.nextDouble();
    String op=a[0];
    if(op.equals("+")) 
    System.out.println(x+y);
    else if(op.equals("-")) 
    System.out.println(x-y);
    else if(op.equals("*")) 
    System.out.println(x*y);
    else if(op.equals("/")) 
    System.out.println(x/y);
    else System.out.println("Invalid");
  }
}
