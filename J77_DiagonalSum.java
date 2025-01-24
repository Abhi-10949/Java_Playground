public class J77_DiagonalSum {

    public static int diagonalSum(int matirx[][]){
        int sum =0;

        //ttime complexity is O(n^2)

        // for(int i = 0;i<matirx.length;i++){  
        //     for(int j= 0 ;j<matirx[0].length;j++){
        //         //for the primary diagonal
        //         if(i==j){
        //             sum+=matirx[i][j];
        //         }
        //         //for seconday diagonal
        //         if(i+j == matirx.length-1){
        //             sum+= matirx[i][j];
        //         }
        //     }
        // }

        

        //optamized code as Time complexity is O(N)

        for(int i =0 ;i<matirx.length;i++){
            //for the primary diagonal when {row=column}
            sum += matirx[i][i];

            //for the secondary diagonal when {row+column = matrix.length-1}

            //condition to not print the repeted value when{i!=j}
            if(i!=matirx.length-1-i){  
                sum+=matirx[i][matirx.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        System.out.println(diagonalSum(matrix)+(" is the sum."));
    }
}