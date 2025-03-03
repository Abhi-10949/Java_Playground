public class J110_usingIteration_109 {

    public static int search(int nums[], int target, int si , int ei){
        while(si<=ei){
            int mid=si+(ei-si)/2;
            //case found
            if(nums[mid]==target){
                return mid;
            }
            //mid is on line 1 
            if(nums[si]<=nums[mid]){
                //left part
                if(nums[si]<=target && target<mid){
                    ei = mid-1;
                }
                //right part
                else{
                    si=mid+1;
                }
            }
            //right sorted part of the array [i.e. mid is on the line 2]
            else{
                if(nums[mid+1]<target && target<=nums[ei]){
                    si =mid+1;
                }
                else{
                    ei =mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        int result=search(nums, target, 0, nums.length-1);
        System.out.println(result+" ");
    }
}
