public class sixtytwo {
    // array practice
    public static void main(String[] args) {
        int a[]=new int[10];  //first type of declaration

        int b[]={1,3,56,45,3,4,58};  //second type of declaration

        int c[];
        c=new int[10];  //third type of declaration

        int []d=new int [5];  //fourth type of declaration

        b[2]=15;  //to change the value according to the index of the given array

        // for(int i=0; i<=b.length; i++){
        //     System.out.println(b[i]+"");
        // }

        // for(int x:b){
        //     System.out.print(" "+(x++)+" ");
        // }

        // for(int x:b){
        //     System.out.println(" "+x+" ");
        // }
        

        //printing the incremented element of the arrays:-
        for(int i=0; i<b.length; i++){
            System.out.print(" "+b[i]++);
        }
         System.out.println("");
        for(int x:b){
             System.out.print(" "+x+" ");
            }


            //we can not print the array element without loop 
            //as it will show some code instead of the elements
            System.out.println(b);

            //but we can check the length of the arraay as:
            System.out.println(b.length);
    }
}
