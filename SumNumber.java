import java.util.Scanner;
public class SumNumber {
  public static void main(String args[]){

  Scanner input = new Scanner(System.in);
  System.out.print("Enter First Number: ");
  int num1 = input.nextInt();

  System.out.print("Enter Second Number: ");
  int num2 = input.nextInt();

  int sum = num1 + num2;
  System.out.println("The Sum of " + num1 + "And" + num2 + "  is: " + sum);
  input.close();
  }
  
}