public class J53_pattern12 {

    public static void hollowRhoumbus(int n){
        for(int i=1 ; i<= n;i++){
            //inner loop - spaces
            for(int j = 1;j <= (n-i);j++){
                System.out.print(" ");
            }
            //inner loop - stars
            for(int j = 1; j<= n;j++){
                if( i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        hollowRhoumbus(5);
    }
}
