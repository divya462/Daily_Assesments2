/*
2. Create a program that simulates a simple calculator using command-line arguments to perform and print the result of addition, subtraction, multiplication, and division..

*/
class Calculator {
  public static void main(String[] args) {
    int a=Integer.parseInt(args[0]), b=Integer.parseInt(args[1]);
    System.out.println("Add="+(a+b));
    System.out.println("Sub="+(a-b));
    System.out.println("Mul="+(a*b));
    System.out.println("Div="+(a/b));
  }
}
