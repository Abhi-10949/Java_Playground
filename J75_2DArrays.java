
import java.util.Scanner;

public class J75_2DArrays {

    //searching the elements in the 2D matrix.
    public static boolean search (int matirx[][],int key){
        for(int i = 0 ;i<matirx.length;i++){
            for(int j =0 ;j<matirx[0].length;j++){
                if(matirx[i][j]==key){
                    System.out.println("Found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element not in the matrix.");
        return false;
    }

    //largest element in the matrix.
    public static int largestElements(int matirx[][]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ;i<matirx.length;i++){
            for(int j =0 ;j<matirx[0].length;j++){
                largest = Math.max(largest, matirx[i][j]);
            }
        }
        return largest;
    }

    public static int smallestElements(int matirx[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ;i<matirx.length;i++){
            for(int j =0 ;j<matirx[0].length;j++){
                smallest = Math.min(smallest, matirx[i][j]);
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        //creating 2d matirx
        int matrix[][]=new int[3][3];
        int key=5;
        int n = matrix.length , m = matrix[0].length;

        System.out.print("Enter the elemets of the matrix: ");
        Scanner sc = new Scanner(System.in);
        for(int  i = 0 ;i<n;i++){
            for(int j =0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i = 0;i<n;i++){
            for(int j = 0 ;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, key);
        int result = largestElements(matrix);
        System.out.println("Largest element in the matrix is: "+result);

        int result1 = smallestElements(matrix);
        System.out.println(result1+" is the smallest value in the matrix.");
    }
}