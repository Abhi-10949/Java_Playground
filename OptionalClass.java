import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhishek", "Naincy", "Tanrun","Sonal");
        // Optional is a class which is used to remove the [NullPointerException]
        Optional<String> name = names.stream()
                            .filter(str -> str.contains("v"))
                            .findFirst();
        // System.out.println(name.get());
        System.out.println(name.orElse("Not Found"));
    }
}
