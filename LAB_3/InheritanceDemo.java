/*
 * Q1: Class Figure with attributes r, a, v. Subclass Cone extends Figure
 * to calculate Area and Volume.
 */
class Figure {
    double r, a, v;
    public void dispArea() { System.out.println("Area: " + a); }
    public void dispVolume() { System.out.println("Volume: " + v); }
}

class Cone extends Figure {
    double h, s;
    double pi = 3.14159;
    
    public Cone(double r, double h, double s) {
        this.r = r; this.h = h; this.s = s;
    }
    public void calcArea() { a = (pi * r * s) + (pi * r * r); }
    public void calcVolume() { v = (pi * r * r * h) / 3; }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Cone c = new Cone(3, 4, 5);
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();
    }
}