





public class fourteen{
    public static void main(String []args){
       /*  int x=19;
        int y=3;
        if(x+y>25){
            System.out.println("x + y is greater than 20");
        }
        else{
            System.out.println("x+y is smaller then 20");
        }*/
        /*String city="gaya";
        if(city=="aurangabad"){
            
            System.out.println("city is aurangabad");
        }
        else if (city=="bhagalpur") {
            System.out.println("city is bhagalpur");
        }
        else if (city=="visakhapatnam") {
            System.out.println("city is visakhapatnam");
        }
        else{
            System.out.println(city);
        }*/
        String address="Delhi,India";
        
        if(address.endsWith("India")){
            if (address.contains("Gaya")) {
                System.out.println("City is Gaya");
            }
        
        else if (address.contains("Mumbai")) {
            System.out.println("City is Mumbai");
        }
        else{
            System.out.println(address.split(",")[0]);
        }
    }
        else{
            System.out.println("You are not leaving in India");
        }
    }
}