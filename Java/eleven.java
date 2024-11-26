
import java.util.Scanner;

public class eleven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int lenght,breadth,height;
        int TotalArea,Volume;

        System.out.println("Enter the lenght , breadth and height: ");

        lenght=sc.nextInt();
        breadth =sc.nextInt();
        height= sc.nextInt();

        TotalArea=2*(lenght*breadth+lenght*height+breadth*height);
        Volume=lenght*breadth*height;

        System.out.println("Area: "+TotalArea);
        System.out.println("Volume: "+Volume);
    }
}