public class J116_Grid_Ways {
    public static int gridWays(int i , int j, int n, int m){
        //Base condition
        if(i == n-1 && j == m-1){ // condition for the last cell
            return 1;
        } else if (i == n || j == n) {  //boundary cross condition
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m); // this is the down condition
        int w2 = gridWays(i, j+1, n, m); // this is the right condition
        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
