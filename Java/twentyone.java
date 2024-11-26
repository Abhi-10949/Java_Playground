public class twentyone{
    public static void main(String[] args) {
        String str1="Mr. Abhishek Kumar";
        System.out.println(str1.startsWith("Mr."));//method-- startswirh()
        System.out.println(str1.startsWith("Abhishek",4));//method are overloaded as given two arguments
        System.out.println(str1.endsWith("Kumar"));//method is endsWith()
        System.out.println(str1.charAt(5));//method is to check the position of the cahracter using index

        for(int i=0; i<str1.length();i++){//method to iterate the condition over the string
            System.out.print(str1.charAt(i));
        }

        System.out.println("\n");

        String str2="www.namo bharat.com";
        System.out.println(str2.indexOf('.',4));//method is indexOf()

        System.out.println(str2.lastIndexOf('.',4));
    }
}