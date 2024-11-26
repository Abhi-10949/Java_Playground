
import java.util.Scanner;

public class thirtyfive {
    public static void main(String[] args) {
        //to find the type of website and the protocol used
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the URL :");
        String url=sc.nextLine();

        String protocol=url.substring(0,url.indexOf(":"));

        if(protocol.equals("http")){
            System.out.println("Hyper Text Transfer Protocol");
        }
        else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }

        String ext=url.substring(url.lastIndexOf(".")+1);
        
        if(ext.equals("com")){
            System.err.println("Commercial");
        }
        if(ext.equals("net")){
            System.err.println("Network");
        }
        if(ext.equals("org")){
            System.err.println("Organisation");
        }
    }
}