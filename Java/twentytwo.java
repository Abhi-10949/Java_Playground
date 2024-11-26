public class twentytwo{
    public static void main(String[] args){
        String str="programmer@gmail.com";
        int i=str.indexOf('@');
        String username=str.substring(0,i);
        String domainName=str.substring(i+1, str.length());
        System.out.println("username :"+username);
        System.out.println("domain :"+domainName);
        System.out.println(domainName.startsWith("gmail"));

        //another method to find the domain name
        int j=domainName.indexOf('.');
        String name=domainName.substring(0,j);
        System.out.println(name.equals("gmail"));
    }
}