public class J98_CopyConstructor {
    public  static void main(String args[]){
        Student s1 = new Student();
        s1.name="Abhishek";
        s1.roll=10949;
        s1.password = "abcdf";
        s1.marks[0]=98;
        s1.marks[1]=99;
        s1.marks[2]=89;

        Student s2 = new Student(s1);  //
        s2.password = "zvjjod";
        s1.marks[1]=100; //this will be act as the reference 
        //of the original array marks 
        //(which will form the error & this solved by Deep & Shallow Copy)

        for(int i = 0 ;i<=3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name; 
    int roll;
    String password;
    int marks[]=new int[3];

    //copy constructor which
    // copies the property of the s1 object to the object s2
    Student(Student s1) { 
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }

    Student() {
        System.out.println("constructor is calling....");
    }

    
    
}
