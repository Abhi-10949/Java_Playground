public class J103_MultipleInheritance_Interface {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.herbivore();
        b.carnivore();
    }
}

//in multiple inheritance we heve the more then one parent class and the single
//child class inherit the property of the parent calss.
interface Herbivore{
    void herbivore();
}

interface Carnivore{
    void carnivore();
}

//inheriting the the interfaces properties: using implements
class Bear implements Herbivore, Carnivore{
    public void herbivore(){
        System.out.println("Bear is Herbivore but, ");
    }
    public  void carnivore(){
        System.out.println("Bear is carnivore also.");
    }
}
