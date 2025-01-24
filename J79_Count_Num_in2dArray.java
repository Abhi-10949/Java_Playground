public class J79_Count_Num_in2dArray{
    public static int search_forTheNum(int matirx[][]){
        int count=0;
        for(int i=0;i<matirx.length;i++){
            for(int j=0;j<matirx[0].length;j++){
                if(matirx[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int matrix[][]={{4,7,8},
                        {8,8,7}};
        int count=7;
        System.out.println(search_forTheNum(matrix));
    }
}
