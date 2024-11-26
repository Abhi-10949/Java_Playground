public class twentyfour{
    public static void main(String[] args){
        //checks wether the number is binary or not
        int i =1001010;
        String str=String.valueOf(i);
        System.out.println(str.matches("[01]+"));

    }
}