/*
3. Write a Java program that asks the user to enter their birth year, then calculates and prints their current age. Assume the current year is 2024.
         Expected Output: If the user inputs "1990", the program should output: "You are 34 years old."
*/
import java.util.Scanner;
class Age {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int birth=sc.nextInt();
    System.out.println("You are "+(2024-birth)+" years old.");
  }
}
