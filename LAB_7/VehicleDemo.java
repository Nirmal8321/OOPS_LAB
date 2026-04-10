// LAB_7 Q2 - Vehicle, Car, Bicycle, Scooter; maxSpeed(), super in constructor
class Vehicle {
    String name;
    Vehicle(String name) { this.name = name; }
    void maxSpeed() { System.out.println(name + " max speed: N/A"); }
}

class Car extends Vehicle {
    int maxSpeedKm;
    Car(String name, int maxSpeedKm) {
        super(name);
        this.maxSpeedKm = maxSpeedKm;
    }
    void maxSpeed() { System.out.println(name + " max speed: " + maxSpeedKm + " km/h"); }
}

class Bicycle extends Vehicle {
    int maxSpeedKm;
    Bicycle(String name, int maxSpeedKm) {
        super(name);
        this.maxSpeedKm = maxSpeedKm;
    }
    void maxSpeed() { System.out.println(name + " max speed: " + maxSpeedKm + " km/h"); }
}

class Scooter extends Vehicle {
    int maxSpeedKm;
    Scooter(String name, int maxSpeedKm) {
        super(name);
        this.maxSpeedKm = maxSpeedKm;
    }
    void maxSpeed() { System.out.println(name + " max speed: " + maxSpeedKm + " km/h"); }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Sedan", 180);
        Vehicle v2 = new Bicycle("Mountain", 40);
        Vehicle v3 = new Scooter("Activa", 80);
        v1.maxSpeed();
        v2.maxSpeed();
        v3.maxSpeed();
    }
}
