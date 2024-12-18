import java.util.Scanner;

public class J29_MulTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate the multiplication table: ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
