public class J37_FuncOverloading {

    //using parameter (Overloading)

    //function to calculate sum of 2 no.
    // public static int sum(int a, int b){
    //     return a+b;
    // }

    // //function to calculate sum of 3 no.
    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }

    //using return type (Overloading)
    //add 2 intiger value
    public static int sum(int a, int b){
        return a+b;
    }

    //add 2 float value
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(5, 3));
        System.out.println(sum(5.8f, 2.3f));
    }
}
