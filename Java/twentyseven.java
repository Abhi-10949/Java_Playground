public class twentyseven {
    public static void main(String[] args){
        //to removing special character from the string
         String str="a!B@c#1 23";
         System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
    }
}
