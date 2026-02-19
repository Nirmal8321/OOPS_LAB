/* Q4: Cylinder class inside FigPackage */
package figpackage;
public class Cylinder extends Figure {
    double h;
    public Cylinder(double r, double h) { this.r = r; this.h = h; }
    @Override
    public void calcArea() { a = (2 * pi * r * r) + (2 * pi * r * h); }
    @Override
    public void calcVolume() { v = pi * r * r * h; }
}