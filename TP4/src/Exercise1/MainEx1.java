package Exercise1;

import Exercise1.Circle.Circle;
import Exercise1.Circle.Cylinder.Cylinder;

public class MainEx1 {
    public static void exercise1() {
        Circle circle1 = new Circle(1, 67, "Gray");
        Cylinder cylinder1 = new Cylinder(circle1, 7);
        Cylinder cylinder2 = new Cylinder(circle1, 10);
        System.out.println(cylinder1.view());
        System.out.println(cylinder2.view());
    }
}
