import java.util.HashMap;
import java.util.Map;

public class Map_Tuto {
    public static void main(String[] args) {
        // Map is the [interface]
        Map<String, Integer> students = new HashMap<>();
        students.put("Abhishek", 89);
        students.put("Naincy", 98);
        students.put("Ayush", 78);
        students.put("Rekha", 81);
        // System.out.println(students.get("Rekha"));
        System.out.println(students.keySet());

        for(String name: students.keySet()){
            System.out.println(name + " : "+ students.get(name));
        }
    }
}
