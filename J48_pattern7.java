import java.util.Scanner;

public class J48_pattern7 {

    public static void invertedHlafPyramind_withNumber(int n){
        for(int i = 1; i<=n; i++){
            for (int j = 1; j<= n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        invertedHlafPyramind_withNumber(n);
    }
}
