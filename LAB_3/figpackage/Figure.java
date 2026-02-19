/* Q4: Abstract class Figure inside FigPackage */
package figpackage;
public abstract class Figure {
    protected double r, a, v;
    protected final double pi = 3.1428;
    public abstract void calcArea();
    public abstract void calcVolume();
    public void dispArea() { System.out.println("Area: " + a); }
    public void dispVolume() { System.out.println("Volume: " + v); }
}