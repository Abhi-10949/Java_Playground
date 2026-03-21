
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhishek", "Naincy", "Rahul");

        // List<String> uName = names.stream()
        //                             .map(name -> name.toUpperCase())
        //                             .toList();
        // System.out.println(uName);

        // use of method reference
        List<String> uName = names.stream()
                                .map(String::toUpperCase) // :: <- this is the method reference
                                .toList();

        // System.out.println(uName);
        uName.forEach(System.out::println);
    }
}
