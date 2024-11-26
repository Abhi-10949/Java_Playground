public class fourtyone {
    public static void main(String[] args) {
        //to print the natural no. up to 10;
        /*for(int i=1;i<=10;i++){
            System.out.print(" "+i);
        }*/

        /*int i=0;
        for(System.out.print("Hi the natural number :");i<=10;){
            System.out.print(" "+i);
            i++;
        }*/

        /*int i=0;
        for(;;){     //infinite for-loop
            System.out.println(i);
            i++;
        }*/

        for(int i=0,j=1   ;  i<=10  ;  i++,j=j*2){  //<--Mast hai yrr ye to
            System.out.println(i+" "+j);
        }
    }
}
