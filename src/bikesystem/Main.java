package bikesystem;

// Abstract Vehicle class
abstract class Vehicle {
    private String color;
    private String brand;

    public Vehicle(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public String getColor() { return color; }
    public String getBrand() { return brand; }

    public abstract void accelerate();
    public abstract void brake();
    public abstract void slowDown();
    public abstract void turn();
}

// Abstract Bike class extending Vehicle
abstract class Bike extends Vehicle {
    private int gear;
    private int id;

    public Bike(String color, String brand, int gear, int id) {
        super(color, brand);
        this.gear = gear;
        this.id = id;
    }

    public int getGear() { return gear; }
    public int getId() { return id; }

    public abstract void shift();
}

// MountainBike class
class MountainBike extends Bike {
    private boolean suspension;

    public MountainBike(String color, String brand, int gear, int id, boolean suspension) {
        super(color, brand, gear, id);
        this.suspension = suspension;
    }

    public void accelerate() {
        System.out.println("MountainBike accelerating on rough terrain.");
    }

    public void brake() {
        System.out.println("MountainBike braking using disc brakes.");
    }

    public void slowDown() {
        System.out.println("MountainBike slowing down on downhill.");
    }

    public void turn() {
        System.out.println("MountainBike turning on trail.");
    }

    public void shift() {
        System.out.println("MountainBike shifting to gear " + getGear());
    }
}

// TandemBike class
class TandemBike extends Bike {
    private int riderCount;

    public TandemBike(String color, String brand, int gear, int id, int riderCount) {
        super(color, brand, gear, id);
        this.riderCount = riderCount;
    }

    public void accelerate() {
        System.out.println("TandemBike accelerating with " + riderCount + " riders.");
    }

    public void brake() {
        System.out.println("TandemBike braking slowly.");
    }

    public void slowDown() {
        System.out.println("TandemBike slowing down together.");
    }

    public void turn() {
        System.out.println("TandemBike making a wide turn.");
    }

    public void shift() {
        System.out.println("TandemBike shifting gears.");
    }
}

// RoadBike class
class RoadBike extends Bike {
    public RoadBike(String color, String brand, int gear, int id) {
        super(color, brand, gear, id);
    }

    public void accelerate() {
        System.out.println("RoadBike accelerating on smooth road.");
    }

    public void brake() {
        System.out.println("RoadBike braking gently.");
    }

    public void slowDown() {
        System.out.println("RoadBike reducing speed.");
    }

    public void turn() {
        System.out.println("RoadBike turning efficiently.");
    }

    public void shift() {
        System.out.println("RoadBike shifting to higher gear.");
    }
}

// ElectricBike class
class ElectricBike extends Bike {
    private int batteryLevel;

    public ElectricBike(String color, String brand, int gear, int id, int batteryLevel) {
        super(color, brand, gear, id);
        this.batteryLevel = batteryLevel;
    }

    public void accelerate() {
        System.out.println("ElectricBike accelerating using battery.");
    }

    public void brake() {
        System.out.println("ElectricBike regenerative braking.");
    }

    public void slowDown() {
        System.out.println("ElectricBike slowing with motor assist.");
    }

    public void turn() {
        System.out.println("ElectricBike making smooth turn.");
    }

    public void shift() {
        System.out.println("ElectricBike auto-shifting based on terrain.");
    }
}

// FoldingBike class
class FoldingBike extends Bike {
    private boolean isFolded;

    public FoldingBike(String color, String brand, int gear, int id, boolean isFolded) {
        super(color, brand, gear, id);
        this.isFolded = isFolded;
    }

    public void accelerate() {
        System.out.println("FoldingBike accelerating in compact mode.");
    }

    public void brake() {
        System.out.println("FoldingBike braking.");
    }

    public void slowDown() {
        System.out.println("FoldingBike slowing.");
    }

    public void turn() {
        System.out.println("FoldingBike turning sharply.");
    }

    public void shift() {
        System.out.println("FoldingBike shifting gear.");
    }
}

// Car class extending Vehicle
class Car extends Vehicle {
    private int doors;

    public Car(String color, String brand, int doors) {
        super(color, brand);
        this.doors = doors;
    }

    public void accelerate() {
        System.out.println("Car accelerating with engine.");
    }

    public void brake() {
        System.out.println("Car braking with ABS.");
    }

    public void slowDown() {
        System.out.println("Car slowing with engine brake.");
    }

    public void turn() {
        System.out.println("Car making a turn.");
    }
}

// Main class with main method
public class Main {
    public static void main(String[] args) {
        Bike[] bikes = new Bike[5];
        bikes[0] = new MountainBike("Red", "Trek", 21, 1, true);
        bikes[1] = new TandemBike("Blue", "Giant", 18, 2, 2);
        bikes[2] = new RoadBike("Yellow", "Bianchi", 24, 3);
        bikes[3] = new ElectricBike("Black", "E-Move", 7, 4, 90);
        bikes[4] = new FoldingBike("Green", "Dahon", 6, 5, false);

        for (Bike bike : bikes) {
            System.out.println("Bike ID: " + bike.getId() + ", Brand: " + bike.getBrand());
            bike.accelerate();
            bike.brake();
            bike.slowDown();
            bike.turn();
            bike.shift();
            System.out.println("-----------------------------");
        }
    }
}
