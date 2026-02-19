/* Q4: Sphere class inside FigPackage */
package figpackage;
public class Sphere extends Figure {
    public Sphere(double r) { this.r = r; }
    @Override
    public void calcArea() { a = 4 * pi * r * r; }
    @Override
    public void calcVolume() { v = (4 * pi * r * r * r) / 3; }
}