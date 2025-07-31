import java.util.Scanner;

class AgeCalculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Weclcome to Age Calculator:");
        System.out.print("Please enter your age:");
        int age = input.nextInt();

        if(age >= 65) {
            System.out.println("you are a Senior Citizen");
        } else if (age >= 20) {
            System.out.println("you are an Adult");
        } else if (age >= 13) {
            System.out.println("you are a Teenager");
        } else {
            System.out.println("ypu are a child");
        }

        }
    }
