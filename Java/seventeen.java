public class seventeen{
    public static void main(String []args)
    {
       //widening and narrowing:-
      byte b=10;
      short s=50 ;
      int i=10; 
      long l=10;
      float f=10.5f;
      double d=10;
      char c=10;
      boolean bl=true;
      
      b=(byte)s;
      System.out.println(b);
      i=s;
      l=s;
      f=s;
      d=s;

      i=(int)f;
      System.out.print(i);//narrowing or downcasting of float to integer

    }
}