
abstract class Vehicle {
    protected String vehicleNumber;
    public Vehicle(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }
    public abstract double calculateToll();
    
    public void showVehicleNumber(){
        System.out.println("Vehicle number is : "+vehicleNumber);
    }
}

class Car extends Vehicle{
    public Car(String vehicleNumber){
        super(vehicleNumber);
    }
    @Override
    public double calculateToll(){
        return  100.0;
    }
}

class Truck extends Vehicle{
    public Truck (String vehicleNumber){
        super(vehicleNumber);
    }

    @Override
    public double calculateToll(){
        return 250.0;
    }
}
class Bike extends Vehicle{
    public Bike (String vehicleNumber){
        super(vehicleNumber);
    }

    @Override
    public double calculateToll(){
        return 50.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("PB10AB1234");
        Vehicle truck = new Truck("HR26XY5678");
        Vehicle bike = new Bike("CH01CD7890");
        
        car.showVehicleNumber();
        System.out.println("Toll Amount: " + car.calculateToll());
        System.out.println();
        
        truck.showVehicleNumber();
        System.out.println("Toll Amount: " + truck.calculateToll());
        System.out.println();
        
        bike.showVehicleNumber();
        System.out.println("Toll Amount: " + bike.calculateToll());
    }
}
