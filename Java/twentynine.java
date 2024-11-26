public class twentynine {
    public static void main(String[] args) {
        //to find the number of words in a string
        String str="    avh  adi sfdi  ";  // " \\s+"<--- this is the meta character
        str=str.replaceAll("\\s+", " ").trim();
        String words[]=str.split("\\s");
        System.out.println(words.length);
    }
}
