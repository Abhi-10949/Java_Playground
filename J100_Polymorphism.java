public class J100_Polymorphism {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum((float)1.5,(float)2.5));
        // System.out.println(calc.sum(1,2, 3));

        Deer d1 = new Deer();
        d1.eat(); //it's output is of deer class bczz we create the 
        //object of deer class.
    }
}

//Function overriding
class Animal{
    void eat(){
        System.out.println("eats anything.");
    }
}
class Deer{
    void eat(){
        System.out.println("eats grass.");
    }
}

//Function overloading 
class Calculator{
    int sum(int a, int b){
       return a + b; 
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a + b+ c;
    }
}
