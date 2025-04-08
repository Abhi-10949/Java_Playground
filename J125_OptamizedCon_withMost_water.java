
public class J125_OptamizedCon_withMost_water {
    public static int maxArea(int []height){
        int n = height.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;

        while(left < right){
            int currentArea = Math.min(height[left], height[right])* (right-left);
            maxArea = Math.max(maxArea, currentArea);

            if(height[left] < height[right]){
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
        System.out.println("The container with maximum water area is : "+maxArea(height)+".");
    }
}
