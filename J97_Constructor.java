

public class J97_Constructor {
    public static void main(String[] args) {
        //constructor overloading but this is the example of Polymorphism
        Student s1 = new Student();

        Student s2 = new Student("Abhishek");
        System.out.println(s2.name);

        Student s3 = new Student(10949);
        System.out.println(s3.roll);

        //for printing both the arguments we need to define the toString()
        // function in the Student class 
        Student s4 = new Student("AtiBhushan",9973);
        // System.out.println(s4); //print simply by object 
        System.out.println("Name: "+s4.name+" RollNo.: "+s4.roll);//2nd method

    }
}

class Student{
    String name;
    int roll;

    //non parametarized constructor
    Student(){
        System.out.println("Constructor is called..");
    }

    //prametarized constructor
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }

    Student (String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    //toString method to print both the value of the consturctor
    public String toString(){
        return "Name: "+name+", RollNo.: "+roll;
    }
}