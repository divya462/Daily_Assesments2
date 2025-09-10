/*
5.  Write a Program to check whether entered number is Odd or Even.

*/
import java.util.Scanner;
class OddEven {
  public static void main(String[] args) {
    int n=new Scanner(System.in).nextInt();
    System.out.println(n%2==0?"Even":"Odd");
  }
}
