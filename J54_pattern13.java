import java.util.Scanner;

public class J54_pattern13 {

    public static void diamondShape(int n){
        for (int i = 1 ; i<= n ; i++){
            //inner loop - spaces (n-i)
            for (int j = 1; j<=(n-i);j++){
                System.out.print(" ");
            }

            //inner loop - stars (2*(i-1)+1)
            for(int j = 1 ; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        // second half of the dimond.
        for (int i = n ; i>=1 ; i--){
            //inner loop - spaces (n-i)
            for (int j = 1; j<=(n-i);j++){
                System.out.print(" ");
            }

            //inner loop - stars (2*(i-1)+1)
            for(int j = 1 ; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        diamondShape(n);

    }
        
}
