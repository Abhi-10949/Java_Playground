public class J94_OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Yellow"); //1st method
        System.out.println(p1.color);
        p1.setTip(2);
        System.out.println(p1.tip);
        System.out.println(p1.color = "Blue"); //2nd method
        System.out.println(p1.tip=5);
    }
}

//creating the class for the pen 
class Pen{
    //attributes or the properties--
    String color;
    int tip;

    //functions or the behaviour--
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
