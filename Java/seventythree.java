public class seventythree {
    public static void main(String[] args) {
        //to find maximum elements
        int A[]={3,23,2,44,12,53,12,33};
        int max=A[0];
        
        for(int i=0; i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println("The maximum number is: "+max);
    }
}
