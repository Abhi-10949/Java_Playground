public class J113_findPermutation {
    public static void findPermuation(String str, String ans){
        //Base Case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recurssion
        for(int i = 0 ;i<str.length();i++){
            char current = str.charAt(i);
            //"abcde"= "ab"+"de"
            String newString = str.substring(0, i) +str.substring(i+1);
            findPermuation(newString, ans+current);
        }
    }
    public static void main(String []abs){
        String str="abc";
        findPermuation(str,"");
    }
}
