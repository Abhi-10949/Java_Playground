public class J60_ReverseArray {
    public static void reverseNumber(int number[]){
        int start = 0 ;
        int last = number.length-1;
        int temp;
        while(start < last){
            temp = number[last];
            number[last] = number[start];
            number[start] = temp;   
            start++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16};
        reverseNumber(numbers);
        for(int i = 0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    
    }
}