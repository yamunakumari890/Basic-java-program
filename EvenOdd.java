import java.util.Scanner;
public class EvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int x = sc.nextInt();

    if (x % 2 == 0) {
      System.out.println("Even Number");
    } else {
      System.out.println("Odd Number");
    }
  }
  
}
