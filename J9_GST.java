import java.util.*;

public class J9_GST {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        float pencil = sc.nextInt();
        float pen = sc.nextInt();
        float eraser = sc.nextInt();
        float total = pencil + pen + eraser;
        float gst = (float) (total*0.18);
        float totalWithGST = total + gst;
        System.out.println("Total cost of items :"+ total);
        System.out.println("GST amount :"+ gst);
        System.out.println("Total cost with GST :"+totalWithGST);

        int $= 24;  // Identifiers can start with the alphabet , underscore or the dollar $.
        System.out.println($);
        }
}
