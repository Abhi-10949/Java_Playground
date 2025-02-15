public class J104_Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "Creane School";

        Student s2 = new Student();
        System.out.println(s2.schoolName);  //the 2nd object also refered to the first object

        Student s3 = new Student();
        s3.schoolName = "DAV";
    }
}

class Student{
    String name;
    int rollNo;
    
    static String schoolName;  //static variable

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}