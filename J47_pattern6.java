import  java.util.*;
public class J47_pattern6 {

    public static void inverted_rotated_halfPyramid(int n){
        for(int i = 1; i<= n; i++){
            for(int j = 1 ; j<= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        inverted_rotated_halfPyramid(n);
    }
}
