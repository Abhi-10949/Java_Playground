public class J67_duplicateElements {

    public static boolean  duplicateEle(int nums[]){
        for(int i = 0 ;i<nums.length-1;i++){
            for(int j = i+1 ; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4};
        boolean result = duplicateEle(nums);
        System.out.println(result);

    }
}
