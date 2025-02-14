public class J99_Inheritance {
    public static void main(String[] args) {
        Fish shark1 = new Fish();
        // shark1.eats(); //the fish class has the property of Animal class.

        Dogs dobby = new Dogs();
        // dobby.eats();//both the derived class have the property of Animal class.
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
        // dobby.breeds = "Rottwiller";
        // System.out.println(dobby.breeds);

        Humans manas = new Humans();
        manas.legs = 2;
        System.out.println(manas.legs);

        Peacock moar = new Peacock();
        moar.fly();
    }
}

//base class
class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}

//Animal derived class
class Mammal extends Animal{
    int legs;
}

//mammal - derived class
class Dogs extends Mammal{
    String breeds;
}

//mammal - derived class
class Humans extends Mammal{
    void speak(){
        System.out.println("Speaks");
    }
}

//Animal derived calss
class Bird extends Animal{
    int height;
}
//Bird derived class
class Peacock extends Bird{
    void fly(){
        System.out.println("can not fly high.");
    }
}

//Animal detived class
class Fish extends Animal{
    int fins;
}

//Fish derived class
class Shark extends Fish{
    String breeds;
}
