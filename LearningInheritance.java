class vehicle {
    void start() {
        System.out.println("vehicle start");
    }

    void stop() {
        System.out.println("Vehicle stop");
    }
}
    class car extends vehicle {
        void accelerate() {
            System.out.println("Car accelerate ");
        }
    }

    class motorcycle extends vehicle {
        void Wheelie() {
            System.out.println("Motorcycle is Wheelie ");
        }
    }

    public class LearningInheritance {
        public static void main(String[] args) {
            car myCar = new car();
            myCar.start();
            myCar.accelerate();
            myCar.stop();
            System.out.println();

            motorcycle motorcycle = new motorcycle();
            motorcycle.start();
            motorcycle.Wheelie();
            motorcycle.stop();
        }
    }

