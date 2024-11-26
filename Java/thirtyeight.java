
import java.util.Scanner;

public class thirtyeight {
    public static void main(String[] args) {
        //display types of sites
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the Domain :");
        String domain=sc.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        
        switch(ext){
            case "com": System.out.println("Commercial");
            break;

            case "org": System.out.println("Organisation");
            break;

            case "net": System.out.print("Network");
            break;

            case "gov": System.out.println("Government");
            break;

            default:System.out.println("Enter the valid extension!!");
            break;

        }
    }
}
