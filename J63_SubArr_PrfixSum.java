public class J63_SubArr_PrfixSum{

    public static void prifixsum(int numbers[]){
        int currentSum =0 ;
        int maxSum = Integer.MIN_VALUE;
        int prifix[]= new int[numbers.length];
        prifix[0]=numbers[0];
        //calculate the prifix array
        for(int i = 1; i<prifix.length;i++){
            prifix[i] = prifix[i-1]+numbers[i];
        }
        
        for(int i = 0 ; i< numbers.length;i++){
            for(int j = i ; j< numbers.length;j++){
                currentSum = i == 0 ? prifix[j] : prifix[j]-prifix[i-1];
                if(maxSum<currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("The maximum sum is : "+maxSum);
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        prifixsum(numbers);
    }
}
