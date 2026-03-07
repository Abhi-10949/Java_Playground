@FunctionalInterface
interface A{
    int show(int i, int j);
}
// class B implements A{
//     public void show(){
//         System.out.println("in a show.");
//     }
// }

public class Functional_Interface {
    public static void main(String[] args) {
        A a = (i,j) -> i+j; // this is the lambda exp
        System.out.println("sum: "+a.show(5, 4));


        // A a = new B();
        // a.show();
    }
}
