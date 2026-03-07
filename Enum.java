enum Status{ // here the Status is the class
//  [   0  ,    1  ,    2   ,   3   ] this is accesed by the ordinal method()
    Running, Failed, Pending, Succes; // this are collection of constant, unchangeable values
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Succes;

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
            default:
                System.out.println("Done");
        }

        // if(s == Status.Running){
        //     System.out.println("All Good");
        // } else if(s == Status.Failed){
        //     System.out.println("Try Again");
        // } else if(s == Status.Pending){
        //     System.out.println("Please Wait");
        // } else{
        //     System.out.println("Done");
        // }


        // Status ss[] = Status.values(); // object of the class of enum types
        // for(Status s : ss){
        //     System.out.println(s+ "  : "+s.ordinal());
        // }
        // System.out.println(s);
        // System.out.println(s.ordinal()); // this prints the place of the constant's
    }
}
