import java.util.Scanner;

public class J38_IsPrime {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2;i<=n-1;i++){  //also can use Math library as [Math.sqrt(n)].
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPrime(n));
    }
}
