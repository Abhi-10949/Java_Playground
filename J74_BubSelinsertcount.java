public class J74_BubSelinsertcount {
    public static void bubbleSort(int arr[]){
        boolean swapped;

        for(int i = 0;i<arr.length-1;i++){
            swapped = false;
            for(int j = 0 ;j<arr.length-i-1;j++){
                //in descending order
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }

            if(!swapped)
            break;
        }
    }

    public static void selectionSort(int arr[]){
        for(int i = 0 ;i <arr.length-1;i++){
            int smallElement= i;
            for(int j = i+1; j<arr.length;j++){
                //descending order
                if(arr[smallElement]<arr[j]){
                    smallElement = j;
                }
            }
            //swap
            int temp = arr[smallElement];
            arr[smallElement] = arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i = 1; i< arr.length;i++){
            int current = arr[i];
            int prev = i-1;
            
            while(prev >=0 && arr[prev]<current){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;
        }
    }

    public static void countingSrot(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[]=new int[largest+1];

        for(int i = 0 ;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting in descending order
        int j = 0;
        for(int i =count.length-1 ;i>0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSrot(arr);
        printArr(arr);
    }
}