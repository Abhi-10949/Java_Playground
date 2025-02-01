public class J91_BitManipulation {
    public static void main(String[] args) {
        //binary AND (&)
        System.out.println(5 & 6); //it is true only for 1 & 1 condition

        //binary OR (|)
        System.out.println(5 | 6); //it is false only for 0 | 0 condition

        //binary XOR (^)
        System.out.println(5 ^ 6);// it is true for differnet value (1^0/ 0^1)

        //binary one's complemetn 
        System.out.println(~5); //called as not operator

        //binary left shift 
        System.out.println(5<<2); // also have formula as {a<<b = a * 2^b}

        //binary right shif
        System.out.println(6>>1); //also have formula as { a>>b = a/2^b}
    }
}
