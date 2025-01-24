import java.util.Scanner;

public class J83_IsStringPalindrome {

    public static boolean isPalindrome(String str){
        for(int i = 0 ;i<str.length()/2;i++){
            int n = str.length()-1-i;
            if(str.charAt(i)!=str.charAt(n)){
                //for checking not a palindrome
                System.out.println("Not a palindrome!");
                return false;
            }
        }
        System.out.println("It is a palindrome.");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));

    }
}
