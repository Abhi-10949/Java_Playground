

abstract class A{
    public abstract  void show();
    public abstract  void config();
}

public class AnnonymousAbst {
    public static void main(String[] args) {
        A obj = new A() 
        {
            public void show()
            {
                System.out.println("in the show.");
            }
            public void config()
            {
                System.out.println("in the config.");
            }
        };
        obj.config();
        obj.show();
    }
}
