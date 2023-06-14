interface Vehicles{
    void start();
    void stop();
}
class bus implements Vehicles{
    @Override
    public void start(){
        System.out.println("Car started");
    }
    @Override
    public void stop(){
        System.out.println("Car stopped");
    }
}
class train implements Vehicles{
    @Override
    public void start(){
        System.out.println("Motorcycle started");
    }
    @Override
    public void stop(){
        System.out.println("motorcycle stopped");
    }

}
public class LearningInterface {
    public static void main(String[] args){
        Vehicles car=new bus();
        car.start();
        car.stop();

        Vehicles Motorcycle=new train();
        Motorcycle.start();
        Motorcycle.stop();
    }
}
