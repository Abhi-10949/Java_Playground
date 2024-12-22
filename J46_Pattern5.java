import java.util.Scanner;
public class J46_Pattern5 {
    //Hollow rectangle
    public static void hollow_rectangle(int totalRows, int totalCols){
        for(int i =1 ; i <= totalRows ; i++){
            for(int j = 1 ; j <= totalCols ; j++){
                if(i == 1 || i == totalRows || j == 1 || j == totalCols){
                    System.out.print("$");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("\nEnter the number of columns: ");
        int cols = sc.nextInt();
        hollow_rectangle(rows, cols);
    }
}
