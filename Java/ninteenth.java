

public class ninteenth{
    public static void main(String[] args){
        //string pratice

        //1.method one
        String str1="java program";
        System.out.println(str1);

        //2.method two
        String str2 = new String("JAVA");//string is created in heap.
        System.out.println(str2 );

        //3.method three using character array
        char ch[]={'h','e','l','l','o'};
        String str3=new String(ch,1,3);
        System.out.println(str3);

        //4.method four using byte array
        byte b[]={65,66,67,68};
        //String str4 = new String(b);

        //for offset and lenght we use as follows
        String str4=new String(b,2,2);
         
        System.out.println(str4);


        //all about the pool 
        String str11 = "java";
        String str12 = "Java";
        System.out.println(str11==str12);//checks the condittion for true 
        String str13= new String("Java");//another method
        System.out.println(str11==str13);//---------^

    }
}