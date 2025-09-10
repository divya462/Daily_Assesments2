/*
4 . Write a Java program that asks the user to enter their weight in kilograms and height in meters, then calculates and prints their Body Mass Index (BMI). Use the formula BMI = weight / (height * height).
*/
import java.util.Scanner;
class BMI {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double w=sc.nextDouble(), h=sc.nextDouble();
    System.out.printf("Your BMI is %.2f", w/(h*h));
  }
}
