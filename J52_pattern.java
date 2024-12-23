public class J52_pattern {
    public static void solidRhombus(int n){
        for(int i=1;i<=n;i++){
            //spacs - (n-i)
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars - 1 to n
            for(int j = 1 ; j<= n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        solidRhombus(5);
    }
}
