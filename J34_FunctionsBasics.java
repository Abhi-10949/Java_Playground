


public class J34_FunctionsBasics {

    //Print the statement using userdefined function.
    public static void printHelloWorld(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        return;
    }

    //calculate the sum.
    public static int printSum(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }

    //swap the no.
    public static void swap(int a, int b){
        int temp;
        temp = a; 
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

    

    public static void main(String args[])    {

        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter a:");
        // int a= sc.nextInt();
        // System.out.print("enter b:");
        // int b= sc.nextInt();

        //printHelloWorld();

        // int sum = printSum(a,b);
        // System.out.println("sum is: " + sum);


        //swap the no.
        int i=5;
        int j=10;
        System.out.println("Before swap i is:"+i);
        System.out.println("Before swap j is:"+j);
        swap(i, j);

        //to print the original value
        System.out.println("Original: "+i);
        System.out.println("Original: "+j);


        
    }
}
