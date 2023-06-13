class vehicle{
    private String Brand;
    private String model;
    private int year;
    private double rentalPrice;

    public vehicle(String Brand, String model, int year, double rentalPrice){
        this.Brand=Brand;
        this.model=model;
        this.year= year;
        this.rentalPrice=rentalPrice;
    }
    public String getBrand(){
        return Brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;

    }
    public double getRentalPrice(){
        return rentalPrice;
    }
    public void displayVehicleInfo(){
        System.out.println("The Brand of vehicle is: "+Brand);
        System.out.println("The model of vehicle is: "+model);
        System.out.println("The year of vehicle is : "+year);
        System.out.println("The rental price of the vehicle is:"+rentalPrice);
    }
}
class car extends vehicle{
    private int noOfSets;

    public car(String Brand, String model, int year, double rentalPrice, int noOfSets){
        super(Brand,model,year,rentalPrice);
        this.noOfSets = noOfSets;
    }
    public int getNoOfSets(){
        return noOfSets;
    }
}
class motorcycle extends vehicle{
    private int engineCapacity;

    public motorcycle(String Brand,String model, int year, double rentalPrice, int engineCapacity){
        super(Brand, model, year, rentalPrice);
        this.engineCapacity= engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args){
        car car=new car("Kia","Seltos",2019,40.0,5);
        motorcycle motorcycle=new motorcycle("java","cs0212",2018,50,10);
        car.displayVehicleInfo();

        System.out.println(" Seats: " + car.getNoOfSets());

        System.out.println();

        motorcycle.displayVehicleInfo();
        System.out.println(" Capacity: " + motorcycle.getEngineCapacity());
    }
}
