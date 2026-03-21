import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import  java.util.List;

class Student{
    int age;
    String name;
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}


public class Comparator_Tuto {
    public static void main(String[] args) {
        // comparator is an interface
        // Comparator<String> com = (i,j)-> i.length() - j.length(); // this is with the lambda exp.
        Comparator<Student> com = new Comparator<Student>() 
        {
            public int compare(Student i, Student j)
            {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> nums = new ArrayList<>();
        nums.add(new Student(21, "Abhishek"));
        nums.add(new Student(20,"Naincy"));
        nums.add(new Student(22,"Kunal"));
        nums.add(new Student(19,"Subodh"));
        Collections.sort(nums, com);
        for(Student studs : nums)
            System.out.println(studs);

        // List<String> nums = new ArrayList<>();
        // nums.add("Abhishek");
        // nums.add("Naincy");
        // nums.add("Kunal");
        // nums.add("Subodh");
        // Collections.sort(nums, com);
        // System.out.println(nums);
    }
}
