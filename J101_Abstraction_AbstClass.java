public class J101_Abstraction_AbstClass {
    public static void main(String []args){
        /*   Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color); //output:brown , bezz the base  class is 
        //called first then the child class either we try to make the objectsVariables
        //for the child class.


        Chicken c = new Chicken();
        c.eat();
        c.walk();    */

        //NOTE: if we will use to create the object of the abstract class
        //it will show error because we can not create the object to the 
        //abstract class. But we can make the constructor for that.


        Mustang myHorse = new Mustang(); 
        // Heirarchy is : Animal -> Horse -> Mustang class
    }
}

//creating the abstract class 
abstract class Animal{
    String color;

    public Animal() {  //constructor to the abstract class
        //color = "brown";
        System.out.println("Animal constructor is called..");
    }
     
    void eat(){
        System.out.println("animal eats.");
    }

    //creating the abstract method
    abstract void walk();
}

//extending it to the child class
class Horse extends Animal{

    public Horse() {
        System.out.println("horse counsturctor called..");
    }
    
    void changeColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("walks on 4 legs.");
    }
}

//exteding the Horse class
class Mustang extends Horse{

    public Mustang() {
        System.out.println("Mustang constructor called..");
    }
    
}

//extending it to the another child class 
class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }

    void walk(){
        System.out.println("walks on 2 legs.");
    }
}