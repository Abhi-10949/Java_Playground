import java.util.*;

public class nine {
    public static void main(String[] args) {
        //Calculate the area of triangle:using both the method's

        /*float base ,area,height;
        System.out.println("Enter base and height :");
        Scanner sc=new Scanner(System.in);
        base=sc.nextFloat();
        height=sc.nextFloat();
        
        area=base*height/2;
        System.out.println("Area of the triangle "+area);*/

        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float s;
        double area;

        System.out.println("Enter the three sides of the triangle: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        s=(a+b+c)/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+area);
    } 
}
