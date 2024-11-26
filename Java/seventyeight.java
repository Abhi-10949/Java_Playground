
import java.util.Arrays;



public class seventyeight {

    public static void binarySearch(int arr[], int l, int r, int x){
        if(r>=l){  //to check for true value
            int mid = l+(r-l)/2;

            if (arr[mid]==x) {
                System.out.println("Element found at index "+mid);
                return;
            }

            if (arr[mid] > x) {
                binarySearch(arr, l, mid-1, x);
            } else{
                binarySearch(arr, r, mid+1, x);
            }
        } else
        System.out.println("Element is not found in the sorted array!!");
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,23,34,33,55,22};
        Arrays.sort(arr);
        int n=arr.length;
        
        int x=34;
        System.out.println(n);
        binarySearch(arr, x, n-1, 0); //to find the array form 0 index to n-1 index
    }
}
