
import java.util.Scanner;

public class J93_Operations_IthBit {
    //get ith bit
    public static int GetIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    //set ith bit
    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return  n | bitmask;  //in the set ith bit we use OR {|}
    }

    //clear ith bit
    public static int clearIthBit(int n , int i ){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.print("Enter the ith position:");
        int i = sc.nextInt();
        System.out.println(clearIthBit(n, i));
    }
}
