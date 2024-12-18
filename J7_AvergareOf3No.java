import java.util.Scanner;

public class J7_AvergareOf3No {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum=A+B+C;
        int average = sum/3;
        System.out.println("The average of the 3 subjects: "+average);
    }
}