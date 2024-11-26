import java.lang.*;
import java.util.*;
/** 
 Printing sum of three numbers
**/
public class second{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        float z=sc.nextFloat();
        float s=x+y+z;
        System.out.println("Sum is "+s);
    }
}