public class J81_TransposeOfMatrics {
    public static void PrintTranspose(int matirx[][]){
        for(int i =0;i<matirx.length;i++){
            for(int j=0;j<matirx[0].length;j++){
                System.out.print(matirx[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row =2;
        int column=3;

        int matirx[][]={{2,3,7},
                        {5,6,7}};

        //displaying the original matirx
        //PrintTranspose(matirx);

        //Transpose of the matrix
        int transpose[][]=new int[column][row];

        for(int i = 0 ;i<row;i++){
            for(int j = 0;j<column;j++){
                transpose[j][i]=matirx[i][j];
            }
        }

        //printing the transpose of the matrix
        PrintTranspose(transpose);
    }
}
