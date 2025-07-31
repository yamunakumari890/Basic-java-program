import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter a Second Number: ");
        int b = sc.nextInt();
        int Add = a + b;
        System.out.println("Add: " + Add);
    }
}
