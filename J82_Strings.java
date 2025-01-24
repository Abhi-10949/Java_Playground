import java.util.Scanner;

public class J82_Strings {

    public static void printString(String name){
        for(int i = 0;i <name.length();i++){
            System.out.print(name.charAt(i)+"");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "abhishek"; //method one for declaration
        String str2=new String("singh"); //2nd method of declaration

        //Strings are immutable

        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); //this will take only single word
        // System.out.println(name);

        // String name2 = sc.nextLine();  //this will take the complete sentence.
        // System.out.println(name2);

        // String fullName = sc.nextLine();
        // System.out.println(fullName.length()); //give the length of the string

        String f1 = "hello";
        String f2 = "abhishek";
        String name = f1 + " "+f2;
        // System.out.println(name);
        // System.out.println(name.charAt(7)); 

        printString(name);

    }
}
