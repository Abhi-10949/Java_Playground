interface A{
    int age = 25;
    String area = "Mumbai";
    void show(); // we need to implement this both the methods to the 
    void config(); //class B to avoid the class B to be converted to abstract class.
}
// we can also create the multiple interface's
interface C{
    void run();
}

interface  D extends C{
    void washing();
}

class B implements A,D{
    public void show(){
        System.out.println("in the show.");
    }
    public void config(){
        System.out.println("in the config.");
    }
    public void run(){
        System.out.println("running..");
    }
    public void washing(){
        System.out.println("in the washing.");
    }
}

public class Interfaces {
    /* NOTE:
    the interface is like a class in which all the methods are by default is : 
    [public abstract].

    and in term of variable in the interface they are
    by default [final and static].
    */
    public static void main(String[] args) {
        A obj = new B();
        D obj1 = new B();
        obj.show();
        obj.config();

        obj1.run();
        obj1.washing();

        System.out.println(A.area);
        System.out.println(A.age);
    }
}
