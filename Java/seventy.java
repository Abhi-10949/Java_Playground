public class seventy {
    public static void main(String[] args){
        int A[]=new int[10];  //1st method to declare array

        int B[]={1,2,3,4,5};  //2nd method to declare array
        System.err.println(B);

        int C[];  //3rd method to declare array
        C=new int[10];

        int[] D=new int[10]; //4th method to declare array

        B[2]=20;

        for(int i=0;i<B.length;i++){
        System.out.println(B[i]);
        }


        for(int i=0;i<B.length;i++){   //array can onlu be updated using counter control loop
            System.out.println(B[i]++);
        }

        //for-each loop : using this loop we can't change the value of the array
        for( int x:B){
            System.out.println(x);
        }
    }
}
