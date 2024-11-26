
import java.util.Scanner;
//searching of the elements:

public class sixtyfour {
    public static void main(String[] args) {
        int a[]={3,4,5,2,52,6,43};
        int key;
        System.out.print("Enter the element to be searched: ");
        Scanner sc=new Scanner(System.in);
        key=sc.nextInt();

        for(int i=0; i<a.length; i++){
            if (a[i]==key) {
                System.out.println("Index of the element:"+i);
                System.exit(0);  //to stop the loop after the iteration
            } 
        }
        System.out.println("Not Found");   
    }
}
