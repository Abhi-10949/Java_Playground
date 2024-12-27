

public class J58_LargestNumber {

    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<number.length;i++){
            if(number[i]>largest){
                largest = number[i];
            }
            if(number[i]<smallest){
                smallest = number[i];
            }
        }
        System.out.println("Smallest number is: "+smallest);
        return largest;
    }

    public static void main(String args[]){
        int number[]={1,2,6,3,5};
        System.out.println("Largest number is :"+getLargest(number));
    }
}
