public class J105_SuperKeyword {
    public static void main(String []args){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal() {
        System.out.println("Animal constructor is called.");
    }
}

class Horse extends Animal{
    Horse(){
        super(); // calls the constructor of the animal class to the horse constructor
        color = "Brown"; //accessing the property of the parent class using Super
        System.out.println("Horse constructor is called.");
    }
}
