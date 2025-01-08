
public class J62_SubArrays {

    //Brute Force - Time Complexity: O(n^3)    

    public static void printSubarrays(int numbers[]){
        int ts = 0;
        //I have to also print the sum of all the subarrays.
        int maxSum = Integer.MIN_VALUE; // to track maximum sum
        // int minSum = Integer.MAX_VALUE; // to track minimum sum
        for(int i = 0; i < numbers.length;i++){
            for(int j = i; j < numbers.length;j++){
                int sum = 0;
                for(int k = i ; k <= j ; k++){
                    // System.out.print(numbers[k]+" ");
                    sum += numbers[k];
                }

                System.out.println(sum);
                if(maxSum < sum){
                    maxSum = sum;
                }
                // maxSum = Math.max(maxSum, sum);
                // minSum = Math.min(minSum, sum); 
                // ts++;
                // System.out.println("=> Sum: " + sum);
            }
            System.out.println();
        }
        // System.out.println("Total Subarrays: "+ts);
        System.out.println("Maximum Subarray Sum: " + maxSum);
        // System.out.println("Minimum Subarray Sum: " + minSum);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
}