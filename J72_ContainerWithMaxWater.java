public class J72_ContainerWithMaxWater {
    public static int containerWithMaxWater(int height[]){
        //using the 2 pointer approach
        int n = height.length;
        int left = 0; 
        int right = n -1; 
        int maxArea =0;

        while (left < right) {
            int currect = Math.min(height[left],height[right])*(right-left);
            maxArea = Math.max(maxArea, currect);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        
        return maxArea;
    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int result=containerWithMaxWater(height);
        System.out.println(result);
    }
}
