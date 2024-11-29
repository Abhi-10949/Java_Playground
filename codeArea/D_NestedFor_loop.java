
import java.util.Scanner;

public class D_NestedFor_loop {
    public static void main(String[] args){
        int i,j;
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        for (i=1;i<=n;i++){
            for (j=1;j<=n;j++){
                System.out.print("("+i+","+j+") ");
            }
            System.out.println(" ");
        }
    }
}
