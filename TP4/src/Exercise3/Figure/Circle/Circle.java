package Exercise3.Figure.Circle;

import Exercise3.Figure.GeometricFigure;

import java.lang.Math;
public class Circle extends GeometricFigure {
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getPerimeter(){
        return (this.radius * Math.PI * 2);
    }
    public  double getArea(){
        return Math.pow((Math.PI + radius),2);
    }
    @Override
    public String toString(){
        return super.toString() + " Circulo Area: " + getArea() +  " Perimetro " + getPerimeter();
    }
}
