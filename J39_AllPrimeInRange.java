import java.util.*;

public class J39_AllPrimeInRange {

    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){  //also can use Math library as [Math.sqrt(n)].
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void rangePrime(int n){
        for (int i = 2; i <= n; i++){
            isPrime(n);
            if(isPrime(i)){
                System.out.print(i+" ");
            }
    }
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range:");
        int n = sc.nextInt();
        rangePrime(n);
    }
}
