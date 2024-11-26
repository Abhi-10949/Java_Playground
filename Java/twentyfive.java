public  class twentyfive {
    public static void main(String[] args) {
        //checks wether the number is hexadecimal{0to9 and A to B}
        String str = "234ABZ";
        System.out.println(str.matches("[0-9A-B]+"));
    }
}
