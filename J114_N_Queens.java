
import java.util.Scanner;

public class J114_N_Queens {
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up 
        for(int i = row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i = row-1, j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonla right up
        for(int i = row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //if from all of the above condition queen Q is not palced then 
        return true;
    }

    public static void nQueens(char board[][],int row){
        //base case
        if(row  == board.length){
            // printBoard(board);
            count++;  //to count the ways
            return;
        }
        //column loop
        for(int j= 0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board, row+1); //to place the queens to the next row
                board[row][j]='x';  //backtracking step
            }
        }
    }

    //print function
    public static void printBoard(char board[][]){
        System.out.println("-------- chess board --------");
        for(int i =0 ;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static int count =0; // to count the ways for the Queens to be placed
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j]='x';
            }
        }
        //calling the nQueens function
        nQueens(board,0);
        System.out.println("Total ways to print the N-Queens: "+count);
    }
}
