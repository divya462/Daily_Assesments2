/*
1. Write a program that declares two integer variables, swaps their values without using a third variable, and prints the result.

  */
import java.util.Scanner;
class Swap {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt(), b=sc.nextInt();
    a=a+b; b=a-b; a=a-b;
    System.out.println("a="+a+" b="+b);
  }
}
