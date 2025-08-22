import java.util.Scanner;
public class Fahrenheit	
{
public static void main(String args[])
{
Scanner input =new Scanner(System.in);
System.out.println("Welcome to Temperature converter\n");
System.out.print("Enter your tem in f:");
float fah = input.nextFloat();
float cal = (fah-32)*5/9;
System.out.println(" your Temperature is: " + cel + "C");
}
}