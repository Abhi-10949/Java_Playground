public class J108_QuickSort {

    public static void quickSort(int arr[],int si, int ei){
        //Base Case 
        if(si>=ei){
            return;
        }
        //last element
        int pindex = partition(arr,si,ei);
        quickSort(arr, si, pindex-1); //left part
        quickSort(arr, pindex+1, ei); //right part
    }

    //2nd step partition
    public static int partition(int arr[],int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // to make space for the elements smaller than pivot
        for(int j= si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //for the swap of the pivot element to it's current position
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]= temp;
        return i;
    }

    public static void main(String []args){
        int arr[]={6,3,9,-5,8,2,5};
        quickSort(arr, 0, arr.length-1);
        for(int result:arr){
            System.out.print(result+" ");
        }
        System.out.println();
    }
}