// LAB_6 Q6 - 3D Point: origin, arbitrary, input, output, distance
import java.util.Scanner;

public class Point3D {
    int x, y, z;

    Point3D() { x = 0; y = 0; z = 0; }
    Point3D(int x, int y, int z) { this.x = x; this.y = y; this.z = z; }

    void input() {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
    }

    void output() {
        System.out.println("(" + x + "," + y + "," + z + ")");
    }

    static double distance(Point3D p1, Point3D p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2) + Math.pow(p2.z - p1.z, 2));
    }

    public static void main(String[] args) {
        Point3D origin = new Point3D();
        Point3D p = new Point3D(3, 4, 0);
        System.out.print("Origin: "); origin.output();
        System.out.print("Point: "); p.input();
        System.out.println("Distance: " + distance(origin, p));
    }
}
