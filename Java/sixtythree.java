
//to find the sum of the elements

public class sixtythree {
    public static void main(String[] args) {
    //  int A[]={3,4,5,2,5};
        int B[]={3,5,6,7,8,};
        int sum=0;

    //     for(int i=0; i<A.length; i++){
    //         sum=sum+A[i];
    //     }
    //     System.out.println("Sum is :"+sum);
    // }
    //using for each loop:
    for(int x:B){
        sum=sum+x;
    }
    System.out.print("Sum is :"+sum);
    }
}
