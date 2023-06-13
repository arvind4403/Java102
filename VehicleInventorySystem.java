import java.util.ArrayList;
import java.util.List;

abstract class Vehicle{
    protected String make;
    protected String model;
    protected int year;
    protected double price;

    public Vehicle(String make, String model, int year, double price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    public abstract void displayDetails();
}

class cars extends Vehicle{
    private int numDoor;
    private String fuelType;

    public cars(String make,String model,int year,double price, int numDoor, String fuelType){
        super(make,model,year,price);
        this.numDoor=numDoor;
        this.fuelType=fuelType;
    }
    @Override
    public void displayDetails(){
        System.out.println("make: "+make);
        System.out.println("model number : "+model);
        System.out.println("Year of car:"+year);
        System.out.println("price of car:"+price);
        System.out.println("no of door "+numDoor);
        System.out.println("type of fuel use in the car"+fuelType);
    }
}
class Motorcycle extends Vehicle{
    private boolean haSidecar;
    private int engineCapacity;
    public Motorcycle(String make, String model, int year, double price, boolean hasSidecar, int engineCapacity) {
        super(make, model, year, price);
        this.haSidecar = hasSidecar;
        this.engineCapacity = engineCapacity;
    }
    @Override
    public void displayDetails() {
        System.out.println("Motorcycle Details:");
        System.out.println("Make:"+ make);
        System.out.println("Model:"+ model);
        System.out.println("Year:"+ year);
        System.out.println("Price:"+ price);
        System.out.println("sidecar:"+ (haSidecar ? "Yes" : "No"));
        System.out.println("Engine Capacity:"+ engineCapacity);
        System.out.println();
    }
    public double calculateSpeed() {
        return 0;
    }

}
public class VehicleInventorySystem {
    public static void main(String[] args) {
        List inventory = new ArrayList<>();

        inventory.add(new cars("kia", "Seltos", 2013, 39000, 4, "Petrol"));
        inventory.add(new Motorcycle("Hero", "ABS123", 2020, 3211, false, 500));

        for (Vehicle vehicle: inventory) {
            vehicle.displayDetails();
        }
    }
}
