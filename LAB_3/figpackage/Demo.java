package figpackage;
/*
 * Q2: Abstract class Figure with abstract methods. Subclasses Cone, Sphere, Cylinder
 * implement these methods.
 */
abstract class FigureAbs {
    double r, a, v;
    final double pi = 3.1420;
    
    abstract void calcArea();
    abstract void calcVol();
    public void dispArea() { System.out.println("Area: " + a); }
    public void dispVol() { System.out.println("Volume: " + v); }
}

class ConeAbs extends FigureAbs {
    double h, s;
    ConeAbs(double r, double h, double s) { this.r = r; this.h = h; this.s = s; }
    void calcArea() { a = (pi * r * s) + (pi * r * r); }
    void calcVol() { v = (pi * r * r * h) / 3; }
}

class SphereAbs extends FigureAbs {
    SphereAbs(double r) { this.r = r; }
    void calcArea() { a = 4 * pi * r * r; }
    void calcVol() { v = (4 * pi * r * r * r) / 3; }
}

class CylinderAbs extends FigureAbs {
    double h;
    CylinderAbs(double r, double h) { this.r = r; this.h = h; }
    void calcArea() { a = (2 * pi * r * r) + (2 * pi * r * h); }
    void calcVol() { v = pi * r * r * h; }
}

public class Demo {
    public static void main(String[] args) {
        ConeAbs c = new ConeAbs(3, 4, 5);
        c.calcArea(); c.calcVol();
        System.out.print("Cone "); c.dispArea(); c.dispVol();
        
        SphereAbs s = new SphereAbs(3);
        s.calcArea(); s.calcVol();
        System.out.print("Sphere "); s.dispArea(); s.dispVol();
    }
}