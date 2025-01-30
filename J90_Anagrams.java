
import java.util.Arrays;
import java.util.Scanner;

public class J90_Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the string 2: ");
        String str2 = sc.nextLine();
        str1  = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //if the sorted character array are same the it's anagram

            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1+ " and "+ str2+ " are anagram to each other.");
            }
            else{
                System.out.println(str1 + " and "+ str2+ "  are not anagram.");
            }
        }
        else{
            System.out.println(str1 + " and "+str2+ " are not anagram.");
        }
    }
}
