// LAB_6 Q4 - Abstract Car, Maruti and Santro, Car1 uses reference to subclass
abstract class Car {
    String name;
    Car(String name) { this.name = name; }
    void display() { System.out.println("Car: " + name); }
    abstract double avg();
    abstract String mode();
}

class Maruti extends Car {
    Maruti() { super("Maruti"); }
    double avg() { return 18.5; }
    String mode() { return "Economy"; }
}

class Santro extends Car {
    Santro() { super("Santro"); }
    double avg() { return 16.0; }
    String mode() { return "City"; }
}

public class CarDemo {
    public static void main(String[] args) {
        Car ref = new Maruti();
        ref.display();
        System.out.println("Avg: " + ref.avg() + " km/l, Mode: " + ref.mode());
        ref = new Santro();
        ref.display();
        System.out.println("Avg: " + ref.avg() + " km/l, Mode: " + ref.mode());
    }
}
