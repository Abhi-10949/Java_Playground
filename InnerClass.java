class A{
    int age;
    public void show(){
        System.out.println("in the show A");
    }
    class B{ // if the class is static we need not to create the object of
        // that class.
        public void config(){
            System.out.println("in the config B");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        // object for the inner class 
        // A.B obj1 = new A.B();  // this is used when the inner class is static
        A.B obj1 = obj.new B();  // this is used when the inner class is not static
        obj1.config();
    }
}
