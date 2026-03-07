class A{
    public void show (){
        System.out.println("in A show");
    }
}

public class AnnonymousClass {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show (){
                System.out.println("in new show"); // this is basically the inner class of the AnnonymousClass.
            }
        };
        obj.show();
    }
}
