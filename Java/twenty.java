public class twenty{
        public static void main(String[] args) {
            //string methods:
            
            /* 
            String str="vscode";

            int len = str.length();
            System.out.println(len);//prints the length

            String str2=str.toUpperCase();//1st option 
            str = str.toUpperCase();//2nd option
            System.out.println(str);//prints the upper case

            String str3=str.toLowerCase();//1st method 
            str= str.toLowerCase();//2nd method
            System.out.println(str);//prints the lower case

            String str4="            abhishek       ";//spaces in b/w the word
            String str5=str4.trim();//1st method
            str4=str4.trim();//2nd method
            System.out.println(str4);//prints the trimed result
            */

          /*   String str =new String("abhishek");
            String str1 = str.substring(1,4);
            //System.out.println(str1);//method to print only form the of the given index
            System.out.println(str1)     */

            String str=new String("java progrmaing");
            String str2=str.replace('a', 'A');
            System.out.println("\n");
            System.out.println(str2+"<---->"+str);
        }
}