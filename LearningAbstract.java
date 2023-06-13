abstract class shape{
    protected String colour;

    public shape(String colour){
        this.colour=colour;
    }

    public abstract double calculateArea();

    public void displayColour(){
        System.out.println("Shape colour is : "+colour);
    }
}
class Circle extends shape{
    private double radius;

    public Circle(String colour,double radius) {
        super(colour);
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
}
class rectangle extends shape{
    private double width;
    private double height;

    public rectangle(String colour, double width, double height) {
        super(colour);
        this.width=width;
        this.height=height;
    }
    @Override
    public double calculateArea(){
        return width*height;
    }
}

public class LearningAbstract {
    public static void main(String[] args){
        Circle circle=new Circle("yellow",3);
        rectangle rectangle=new rectangle("blue",10,8);

        circle.displayColour();
        System.out.println("The circle colour is : "+circle.calculateArea());

        System.out.println();

        rectangle.displayColour();
        System.out.println("The area of rectangle is : "+rectangle.calculateArea());
    }
}
