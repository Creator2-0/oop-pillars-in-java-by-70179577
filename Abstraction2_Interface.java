// Abstraction Program 2: Interface defines WHAT, classes define HOW
public class Abstraction2_Interface {

    interface Vehicle {
        void start();

        void stop();

        void fuelType();
    }

    static class Car implements Vehicle {
        public void start() {
            System.out.println("Car starts with a key");
        }

        public void stop() {
            System.out.println("Car stops with brakes");
        }

        public void fuelType() {
            System.out.println("Car uses petrol");
        }
    }

    static class ElectricBike implements Vehicle {
        public void start() {
            System.out.println("Bike starts with a button");
        }

        public void stop() {
            System.out.println("Bike stops with regenerative braking");
        }

        public void fuelType() {
            System.out.println("Bike uses battery");
        }
    }

    public static void main(String[] args) {
        // user only knows the interface, not the internal details
        Vehicle[] vehicles = { new Car(), new ElectricBike() };
        for (Vehicle v : vehicles) {
            v.start();
            v.fuelType();
            v.stop();
            System.out.println("-----");
        }
    }
}
