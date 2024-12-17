import java.util.*;

public class J5_Inputs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // // String name = sc.nextLine();
        // // System.out.println(name);

        // // int number = sc.nextInt();
        // // System.out.println(number);

        // // float price= sc.nextFloat();
        // // System.out.println(price);

        // // double d= sc.nextDouble();
        // // System.out.println(d);

        // // boolean b= sc.nextBoolean();
        // // System.out.println(b);

        // // short s = sc.nextShort();
        // // System.out.println(s);

        float a= sc.nextFloat();
        float b= sc.nextFloat();
        
        float sum;
        sum = a+b;

        float product;
        product = a*b;

        float radius = sc.nextFloat();
        float areaOfCircle;
        areaOfCircle = 3.14f * radius * radius;

        System.out.println(sum);  //sum of two no.
        System.out.println(product); //product of two no.
        System.out.println(areaOfCircle); //area of the circle.



        //implicit conversion
        // long i = 10 ;
        // int d = i;
        //Scanner sc = new Scanner (System.in);
        // int f= sc.nextFloat();
        // System.out.println(f);


        //Type casting 
        float f= 10.23f;
        int i=(int)f;
        System.out.println(i);

        char ch='A';
        int number = ch;
        System.out.println(number);
    }    
}
