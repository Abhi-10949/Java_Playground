public class J69_selectioSort {

    public static void SelectionSort(int arr[]){
        for(int i = 0 ; i<arr.length-1;i++){
            int smallElement = i ;
            for(int j= i+1 ;j<arr.length;j++){
                if(arr[smallElement] > arr[j]){ //to print the elements in decreasig order "<"
                    smallElement=j;
                }
            }
            //swap
            int temp = arr[smallElement];
            arr[smallElement]=arr[i];
            arr[i]=temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0 ;i <arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        SelectionSort(arr);
        printArr(arr);
    }
}
