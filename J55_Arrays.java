import java.util.Scanner;

public class J55_Arrays {
    public static void main(String args[]){
        int marks[]= new int[100];
        // int numbers[]= {1,2,3,4,5};
        // String names[]= {"Mango", "Apple", "Banana"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of the array: "+marks.length);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("Phy: "+marks[0]);
        System.out.println("Chem: "+marks[1]);
        System.out.println("Maths: "+marks[2]);

        //updated value of the marks
        marks[0]=98;
        marks[2]=marks[2]+1; // update the marks with the plus 1.
        System.out.println(marks[0]);
        System.out.println(marks[2]);
}
}
