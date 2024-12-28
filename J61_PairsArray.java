public class J61_PairsArray{

    public static void printPair(int number[]){
        int tp = 0;
        for(int i = 0; i<number.length;i++){
            int current = number[i];
            for(int j = i+1; j<number.length;j++){
                System.out.print("(" + current+"," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+ tp);
    }


    public static void main(String args[]){
        int number[] = {2, 4,6,8,10,12};
        printPair(number);
    }
}