public class J68_bubbleSort {
    
    public static void bubbleSort(int arr[]){
        boolean swapped ;
        for(int i = 0 ; i<arr.length-1;i++){
            swapped = false; 
            for(int j= 0 ; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(); //only for removing the % sign from the output area.
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }
}