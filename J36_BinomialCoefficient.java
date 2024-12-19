import java.util.*;


public class J36_BinomialCoefficient {

    public static int factorial(int n){  //helper function.
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int BinCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
    
        int BinCoeff = fact_n/(fact_r*fact_nmr);
        return BinCoeff;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the r: ");
        int r = sc.nextInt();

        System.out.println(BinCoeff(5, 2));
    }
}
