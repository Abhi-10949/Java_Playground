import java.util.*;

public class J26_PrimeCheckLoop {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();


    if(n==2){
        System.out.println("2 is a prime number.");
    }
    else{
        boolean isPrime = true;
        for (int i = 2 ; i< n-1 ; i++){ //here we can also use --> [Math.sqrt(n)].
            if(n % i==0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("The number is Prime.");
        }
        else{
            System.out.println("The number is not Prime.");
        }
    }
}
}