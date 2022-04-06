package Exercise1.Circle;
import java.lang.Math;
public class Circle {
    public int circleNumbre = 1;
    private double radious = 1.0;
    private String colour = "Red";

    public Circle() {
    }

    public Circle(int number,double radious, String colour) {
        this.radious = radious;
        this.colour = colour;
        this.circleNumbre = number;
    }

    public double getRadious() {
        return radious;
    }

    public String getColour() {
        return colour;
    }
    public double getArea(){
        return (Math.pow(getRadious(),2) * Math.PI);
    }

    @Override
    public String toString() {
        return "Circle "+ circleNumbre + " {"  +
                " radious = " + radious +
                ", colour = '" + colour + '\'' +
                ", area = " + String.format("%.2f",getArea()) +
                '}';
    }
}

