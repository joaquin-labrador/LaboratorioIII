package Exercise3.Figure.Rectangle;

import Exercise3.Figure.GeometricFigure;

public class Rectangle extends GeometricFigure {
    private double longSize;
    private double widthSize;

    public Rectangle() {
    }
  // PARA CUADRADOS
    public Rectangle(String color, double size) {
        super(color);
        this.longSize = size;
        this.widthSize = size;

    }

    public Rectangle(String color, double longSize, double widthSize) {
        super(color);
        this.longSize = longSize;
        this.widthSize = widthSize;
    }
    public double getPerimeter(){
        return  (this.longSize * 2) + (this.widthSize * 2);
    }
    public double getArea(){
        return  this.longSize * this.widthSize;
    }
    @Override
    public String toString(){
        return super.toString() + ((this.widthSize == this.longSize) ? "Cuadrado" : "Rectangulo" )+ " Area " + getArea() + " Perimetro " + getPerimeter();
    }
}
