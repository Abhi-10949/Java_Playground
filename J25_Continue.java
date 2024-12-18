import java.util.*;

public class J25_Continue {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        //int n = sc.nextInt();

        // for (int i = 0 ; i <= n ; i++){
        //     if (i == 5){
        //         continue; 
        //     }
        //     System.out.print(i+" ");
        // }

        do{
            System.out.print("Enter the number: ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;
        }
        System.out.println("The number was "+n);
    } while(true);
}
}
