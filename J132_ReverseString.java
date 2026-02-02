import java.util.Scanner;
import java.util.Stack;

public class J132_ReverseString {
    public static String reverseString(String str){
        Stack<Character> st = new Stack<>();
        // push all the character's to the stack
        for(int i = 0 ;i<str.length();i++){
            st.push(str.charAt(i));
        }
        // popoing and storing all the character's
        StringBuilder reversed = new StringBuilder();
        while(!st.isEmpty()){
            reversed.append(st.pop());
        }
        return reversed.toString();
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        String output = reverseString(input);
        System.out.println(output);
    }
}
