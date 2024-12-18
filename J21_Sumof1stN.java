import java.util.*;

public class J21_Sumof1stN {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();


        // int sum = 0;
        // int i = 0;
        // while (i<=n){
        //     sum = sum + i;
        //     i++;
        // }
        // System.out.println(sum);

        for(int stars =1; stars<=n; stars++){
            System.out.println("* * * *");
        }
    }
}
