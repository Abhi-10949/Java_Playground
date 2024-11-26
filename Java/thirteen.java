public class thirteen{
    public static void main(String []args){
        //int x=10,y=6;
        //int z=x&y;
        //int x=0b1010;
        //int y=0b0110;
        //int z=x&y;//This is the AND operator
        //int z=x|y;//This is the OR operator
        
        //int x=0b1000;
        //int y;
        //y=x>>1;
        /*int x=-0b1010;
        int y=x>>1; //unsigned rright shift.
        System.out.println(String.format("%s",Integer.toBinaryString(y)));*/

        int x=0b1010;
        int y=~x;
        System.out.println(String.format("%s",Integer.toBinaryString(y)));
        System.out.println(x);
        System.out.println(String.format("%32s",Integer.toBinaryString(y)));
    }
}