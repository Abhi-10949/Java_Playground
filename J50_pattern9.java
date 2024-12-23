import java.util.Scanner;

public class J50_pattern9 {

    public static void triangle_01(int n){
        for (int i = 1 ; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                int sum = i + j; //the sum of the row and coloumn should be even and printed as 1 else print 0.
                if(sum % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        triangle_01(n);
    }
}