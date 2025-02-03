public class J96_Getter_Setter {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        //getter funciton is called
        p1.setColor("Green");
        p1.setTip(5);
        
        //setter functionis called
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

class Pen{
    private String color;
    private int tip;

    //setter function
    void setColor(String newColor){
        this.color = newColor;
    }
    //setter function
    void setTip(int tip){
        this.tip= tip;
    }

    //getter functio
    String getColor(){
        return this.color;
    }
    //getter function
    int getTip(){
        return this.tip;
    }
}