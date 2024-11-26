
public class seventynine {
    public static void main(String[] args) {
        String str="programmer@gamil.com";
        int i=str.indexOf('@');
        System.out.println("Index of {@} :"+i);
        String str1=str.substring(0, i);
        String str2=str.substring(i+1, str.length());

        String str3=str.substring(11, 16);
        boolean b=str.contains(str3); //to check wether the letters are present in string or not
        System.out.println(b);

        System.out.println("User name: "+str1);
        System.out.println("Domain name: "+str2);

        int a=10010011;
        String st=a+"";
        System.out.println(st.matches("[01]+"));

        String k="30/12/2024";
        System.out.println(k.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
        System.out.println(k.matches("[1-31]/[1-12]/[0-9]{4}"));


        String f="a23#%FS";
        System.out.println(f.replaceAll("[^a-zA-Z0-9]",""));
        String g="abhishek      kumar     singh";
        System.out.println(g.replaceAll("\\s+", " "));
        String j="       alsdkhds kg     dfhkjsiekd";
        String n=j.trim();
        System.out.println(n);

        String o=" sfhyd feu    khdf sdd     djhfise ";
        o=o.replaceAll("\\s+", " ").trim();
        String arr[]=o.split("\\s");
        System.out.println(arr.length);
    }
}
