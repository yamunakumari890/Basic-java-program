<<<<<<< HEAD
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) 
    {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int Number = sc.nextInt();
        for(int i=1; i<=Number; i++) {
            fact = fact * i;
        }
            System.out.println("Factorial: " + Number + " is:" +fact);
        }
    }
=======
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) 
    {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int Number = sc.nextInt();
        for(int i=1; i<=Number; i++) {
            fact = fact * i;
        }
            System.out.println("Factorial: " + Number + " is:" +fact);
        }
    }
>>>>>>> 2e24ae90636898c690556c6d0be836a799bad162
