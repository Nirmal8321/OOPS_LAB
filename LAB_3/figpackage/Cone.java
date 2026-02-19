/* Q4: Cone class inside FigPackage */
package figpackage;
public class Cone extends Figure {
    double h, s;
    public Cone(double r, double h, double s) { this.r = r; this.h = h; this.s = s; }
    @Override
    public void calcArea() { a = (pi * r * s) + (pi * r * r); }
    @Override
    public void calcVolume() { v = (pi * r * r * h) / 3; }
}