import  java.util.*;
public class J24_Break {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            if(n % 10 == 0){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println("\nGet out of the loop!");
    }
}
