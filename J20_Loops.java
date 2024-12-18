import java.util.Scanner;

public class J20_Loops {
    public static void main(String args[]){
        //int i=1;
        // System.out.println("The number is: ");
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // } 
        // System.out.println("The number is printed!");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        // while (i<=range){
        //     System.out.println(i);
        //     i++;
        // }

        for(int i =1;i<=range;i++){
            System.out.print(i+" ");
        }
    }
}
