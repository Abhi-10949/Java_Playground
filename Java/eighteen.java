public class eighteen{
    public static void main(String[] args){
        int x=-10;
        float y=12.56f;
        char z='A';
        String str="Java Programing";
        System.out.printf("Hello %d %e %c World\n",x,y,z);
        System.out.printf("Hello %sf\n",str);
        System.out.println("Sum of two no. "+x+" and "+y+" is: "+(x+y)+ ".");
        System.out.printf("%(5d",x);//width of the value.And 0 is the flag."(" this shows the -ve no. in positive. 
        //"%=5d" shows the +ve no.
        System.out.printf("\n%06.2f",y);//width and presision in float.Also using the flag as "0"
        System.out.format("\n%-20s",str);//width and presision in string and flag as "-"i.e.  spaces are given after the words.
        //here we can use "format" in the place of "printf".
    }
}