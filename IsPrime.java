import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean IsPrime= true;
        for(int i=2; i<=n/2; i++){
            if(n%2==0){
                break;
            }
        }
        if(IsPrime)
        System.out.println(n + " Is Prime");
        else
        System.out.println(n + " Is Not Prime");
    }
}
