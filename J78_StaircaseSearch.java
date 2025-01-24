
import java.util.Scanner;

public class J78_StaircaseSearch {

    public static boolean staircaseSearch(int matirx[][],int key){

        //This is for the top-right cornor stair-case.

        // int row = 0, col= matirx[0].length-1;
        // while(row<matirx.length && col>=0){
        //     if(matirx[row][col]==key){
        //         System.out.println("found key at cell ("+row+","+col+")");
        //         return true;
        //     }
        //     else if(key<matirx[row][col]){
        //         col--;
        //     }
        //     else{
        //         row++;
        //     }
        // }
        // System.out.println("Element not found!!");
        // return false;

        
        //For the bottom-left cornor stair-case.key

        int row = matirx.length-1, col=0;

        while(row>=0 && col<=matirx.length){
            if(matirx[row][col]==key){
                System.out.println("Key found at cell ("+row+","+col+")");
                return true;
            }
            else if(key<matirx[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Not found!!");
        return false;
    }
    public static void main(String[] args) {
        int matirx[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key :");
        int key = sc.nextInt();
        staircaseSearch(matirx, key);
    }
}