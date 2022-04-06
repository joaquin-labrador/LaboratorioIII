package Exercise1.Circle.Cylinder;

import Exercise1.Circle.Circle;

public class Cylinder extends Circle {
    public double high = 1.0;


    public Cylinder() {
    }

    public Cylinder(double high) {
        this.high = high;
    }

    public Cylinder(Circle circle, double high) {
        super(circle.circleNumbre,circle.getRadious(), circle.getColour());
        this.high = high;
    }

    public double getVolume() {
        return getArea() * this.high;
    }

    @Override
    public String toString() {
        return "Cylinder " +
                "high=" + high +
                ", volume= " + String.format("%.2f", getVolume()) +
                ", circle = " + super.toString() +
                ' ';

    }

    public String view() {
        return "Cylinder: subclass of " + super.toString() + " high of: " + this.high + " cm "+ " volume: "
                + String.format("%.2f",getVolume()) + " cm3 ";
    }
}
 /*   public String view(){
        StringBuilder view = new StringBuilder();
        view.append("Cylender : subclass of circle ");
        view.append(super.getColour());




    }
}*/
