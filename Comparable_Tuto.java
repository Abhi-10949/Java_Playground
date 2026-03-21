
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
         if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class Comparable_Tuto {
    public static void main(String[] args) {
        List<Student> nums = new ArrayList<>();
        nums.add(new Student(21, "Abhishek"));
        nums.add(new Student(20,"Naincy"));
        nums.add(new Student(22,"Kunal"));
        nums.add(new Student(19,"Subodh"));

        Collections.sort(nums);
        for(Student s: nums){
            System.out.println(s);
        }
    }
}
