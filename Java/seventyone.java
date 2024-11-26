

public class seventyone {
    public static void main(String[] args) {
        //Finding sum of all elements
        int A[]={3,4,5,3,2,32};
        int sum=0;

        // for(int i=0; i<A.length; i++){
        //     sum=sum+A[i];
            
        // }

        for(int x:A){  //printing using for-each loop
            sum=sum+x;
        }
        System.err.println("The sum of the array elements are :"+sum);
    }
}
