public class J85_CompareFunctionString {
    public static String substringFun(String str1 , int si, int ei){
        String subString="";
        for(int i = si ;i<ei;i++){
            subString+= str1.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        String str1 = "hello World";
        // String str2 = "hello";
        // String str3 = new String(str1);
        // System.out.println(str1==str2);
        // System.out.println(str1.equals(str3));

        //inbuilt substring function in java
        System.out.println(str1.substring(0,5));
        
        //System.out.println(substringFun(str1, 0, 5));


        String fruits[]={"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int  i = 1 ; i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
