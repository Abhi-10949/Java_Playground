public class J88_stringCompression {

    public static String compress(String str){
        // String newString = "";

        // for(int i = 0 ;i<str.length();i++){
        //     Integer count = 1; 
        //     while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     newString += str.charAt(i);
        //     if(count >1){
        //         newString += count.toString();
        //     }
        // }
        // return newString;

        StringBuilder newString = new StringBuilder("");

        for(int i =0;i<str.length();i++){
            int count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newString.append(str.charAt(i));
            if(count>1){
                newString.append(count);
            }
        }
        return newString.toString();

    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
