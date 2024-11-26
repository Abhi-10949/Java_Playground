public class twentyeight {
    public static void main(String[] args){
        //remove the extra spaces from the string
        String str="       aBhishek       Kumar     ";
        System.out.println(str.replaceAll("\\s+", " ").trim());
    }
}
