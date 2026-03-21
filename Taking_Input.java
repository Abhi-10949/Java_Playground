import java.io.IOException;
import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);


        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close();
    }
}
