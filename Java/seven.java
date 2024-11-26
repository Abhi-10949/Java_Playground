import java.lang.*;

public class seven{
    public static void main(String[] args){
        //with the help of Unicode printing the different language code 
        
        for(char c=0x2300;c<=0x23FF;c++)  //APL Symbols[Technical Language]
        System.out.print(c+" ");

        System.out.println(" ");
       //for telgu
        for(char s=0x0C00;s<=0x0C7F;s++)
        System.out.print(s+" ");
    }
}