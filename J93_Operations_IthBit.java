
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

    //update ith bit 
    public static int updateIthBit(int n , int i , int newBit){
//this is 1st method

        // if(newBit ==0 ){
        //     return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }

//this is the 2nd method
        n = clearIthBit(n, i);
        int bitMask= newBit<<i;
        return n| bitMask;
    }

    //clear last i bit 
    public static int clearLastIBit(int n , int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    //clear range of bit 
    public static int clearRangeBit(int n , int i ,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    
    //to check if a number if power of 2 or not
    public static boolean NumberisPowerof2(int n){
        return (n & (n-1))==0;
    }

    //count SET bits in a number
    public static int countSETbits(int n){
        int count =0;
        while(n>0){
            if((n & 1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    //Fast Exponential
    public static int fastExpo(int a , int n){
        int ans = 1;
        while(n>0){
            if((n & 1)!=0){ //check the LSB
                ans = ans * a;
            }
            a = a *a;
            n = n>>1;
        }
        return ans;
    }

    //to calculate the modular exponential
    public static int ModularExpo(int a, int n, int x){
        int ans = 1;
        while(n>0){
            if((n &1)!=0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans%x;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number:");
        // int n = sc.nextInt();
        // System.out.print("Enter the ith position:");
        // int i = sc.nextInt();

        //System.out.println(clearIthBit(n, i));

        // System.out.println(updateIthBit(n, i, 1));
        // System.out.println(clearLastIBit(n, i));

        // System.out.println(clearRangeBit(n, i, 4));
        // System.out.println(NumberisPowerof2(n));

        // System.out.println(countSETbits(n));

        // System.out.println(fastExpo(3 ,5));
        
        //System.out.println(ModularExpo(2, 3, 5));  //output will be 3.


        //swap two numbers without using the third number {XOR operator}
        // int x = 3, y = 4;
        // System.out.println("Before swap: x = "+x+" and y = "+y);
        // //swap using xor
        // x = x^y;
        // y = x^y;
        // x = x^y;
        // System.out.println("After swap: x = "+x+" and y = "+y);

        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch|' '));
        }
    }
}