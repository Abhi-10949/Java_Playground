import java.util.*;

public class J27_SumOfEven_Odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        
        for (int i = 0; i<=number;i++){
            if(number % 2 ==0){
                evenSum += number; 
            }
            else{
                oddSum += number;
            }
        }
        System.out.println("The number is EVEN so, "+"Sum of given numbers is "+evenSum);
        System.out.println("The number is ODD so, "+"Sum of given numbers is "+oddSum);
    }
}
