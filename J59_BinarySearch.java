
import java.util.Scanner;


public class J59_BinarySearch {

    public static int binSearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        int mid = 0;
        while (start<=end){
            mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            else if(numbers[mid]<key){
                //right part of the sorted array
                start = mid +1;
            } else{
                //left part of the sorted array
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[]={2,4,6,7,8,10,12,14};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int key = sc.nextInt();
        System.out.println("Numbers found at index: "+binSearch(numbers, key));
    }
}
