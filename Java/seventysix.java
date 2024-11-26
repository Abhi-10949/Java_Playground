public class seventysix {
    public static void main(String[] args) {
        //swap two number without third variable

        int v1=23;
        int v2=32;
        v1=v1^v2;
        v2=v1^v2;
        v1=v1^v2;
        String v=Integer.toBinaryString(v1);
        System.out.println(String.format("%s", Integer.toBinaryString(v2)));
        System.out.println(v);
        System.out.print(v1+" "+v2);
    }
}
