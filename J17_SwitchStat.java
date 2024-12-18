import java.util.*;

public class J17_SwitchStat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number){
            case 3: System.out.println("HTML");
            break;

            case 1: System.out.println("CSS");
            break;

            case 2: System.out.println("Java Script");
            break;

            default: System.out.println("You should maintain the consistency!");
        }
    }
}
