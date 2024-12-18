import java.util.Scanner;

public class J12_LargestOf2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        if(a>=b){
            System.out.println("A is largest of the 2.");
        }
        else{
            System.out.println("B is largest of the 2.");
        }
    }
}
