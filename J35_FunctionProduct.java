
public class J35_FunctionProduct {

    public static int multiplication(int a, int b){
        int product = a*b;
        return product;
    }

    public static int Factorial(int n){
        int fact = 1;
        for (int i=n;i>=1;i--){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int a=5;
    int b=20;

    int product=multiplication(a,b);
    System.out.println("The product is :"+product);
    

    int n=5;
    int fact= Factorial(n);
    System.out.println("factorial: "+fact);
    }
}
