import figpackage.*;

public class DemoPackage {
    public static void main(String[] args) {
        Sphere s = new Sphere(5);
        s.calcArea(); s.calcVolume();
        s.dispArea(); s.dispVolume();

        Cylinder c = new Cylinder(3, 5);
        c.calcArea(); c.calcVolume();
        c.dispArea(); c.dispVolume();

        Cone co = new Cone(2, 6, 7);
        co.calcArea(); co.calcVolume();
        co.dispArea(); co.dispVolume();
    }
}