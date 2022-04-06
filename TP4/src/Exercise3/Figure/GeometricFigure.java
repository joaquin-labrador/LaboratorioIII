package Exercise3.Figure;

public abstract class GeometricFigure {
    private String color;

    public GeometricFigure() {
    }

    public GeometricFigure(String color) {
        if(color.isEmpty()){
            color = "No color";
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return "{ " +
                " color= '" + color + '\'' +
                '}';
    }
}
