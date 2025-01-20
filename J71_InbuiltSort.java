//import the library
import java.util.Arrays; 
import java.util.Collections;

public class J71_InbuiltSort {

    //make the print function to print the array elements
    public static void printArr(Integer arr[]){
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        // int arr[]={5,2,1,4,3}; //array
        //only sorting for the selected elements use {Arrays.sort(arr,startIndex, endIndex)}
        // Arrays.sort(arr,0,3); //inbuilt sorting technique for sorting in java
        // printArr(arr); // calling the print function

        // for reverese we use object type of the datatype as 
        Integer arr[]={5,4,1,3,2};
        Arrays.sort(arr,Collections.reverseOrder());
        printArr(arr);
    }
}
