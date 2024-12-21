import java.util.Scanner;

public class J44_isPalindrome {

    public static boolean isPalindrome(int number){
        int palindrome = number;
        int reverse = 0;
       // int number = palindrome;
        while(palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 +remainder;
            palindrome /= 10;
        }
        if(number == reverse){
            return true;
        }
       
            return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println(palindrome + " is a palindrome.");
        }
        else{
            System.out.println(palindrome + " is not a palindrome.");
        }

    }
}
