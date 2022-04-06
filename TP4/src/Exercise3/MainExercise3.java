    package Exercise3;
import Exercise3.Figure.Circle.Circle;
import Exercise3.Figure.GeometricFigure;
import Exercise3.Figure.Rectangle.Rectangle;
import Exercise3.Figure.Rectangle.Square.Square;
import java.util.ArrayList;

public class MainExercise3 {
    public static void exercise3(){
        ArrayList<GeometricFigure> figures = new ArrayList<>();
        Circle circulo1 = new Circle("Rojo", 5.8);
        Circle circulo2 = new Circle("", 9);
        Rectangle rectangle1 = new Rectangle("Rojo", 5, 8);
        Square cuadrado1 = new Square("White",5);//Es un cuadrado
        figures.add(circulo1);
        figures.add(circulo2);
        figures.add(rectangle1);
        figures.add(cuadrado1);
        showFigures(figures);

    }
    public static void showFigures(ArrayList <GeometricFigure> figuras){
        for (var figures: figuras) {
            System.out.println(figures);
        }
    }

}
