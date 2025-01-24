public class J80_SumOfRow {
    public static void printRowSum(int nums[][]){
        int sum =0;
        //sum of second row.
        int i=1;
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[i][j];
        }
        System.out.println(sum+" is the sum of 2nd row.");
    }
        public static void main(String[] args) {
        int nums[][]={{1,4,9},
                      {11,4,3},
                      {2,2,3}};
        
        printRowSum(nums);
    }
}
