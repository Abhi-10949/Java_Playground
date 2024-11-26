public class fifteen{
    public static void main(String[] args) {
        //swapping two no. using bitwise XOR
        int a=10 , b=15;
        a= a^b;
        b=a^b;
        a=a^b;

        System.out.println(a+" "+b);
    }}
