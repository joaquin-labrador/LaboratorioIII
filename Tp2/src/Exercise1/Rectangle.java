package Exercise1;

public class Rectangle {
    private double longSize = 1.0;
    private double wideSize = 1.0;

    public Rectangle() {

    }

    public Rectangle(double L, double W) {
        this.longSize = L;
        this.wideSize = W;

    }

    public double getLongSize() {
        return longSize;
    }

    public void setLongSize(double longSize) {
        this.longSize = longSize;
    }

    public double getWideSize() {
        return wideSize;
    }

    public void setWideSize(double wideSize) {
        this.wideSize = wideSize;
    }

    public double area(double L, double W) {
        return (L >= 0 && W >= 0) ? L * W : 0;
    }

    public double perimeter(double L, double W) {
        return (L >= 0 && W >= 0) ? (2 * L) + (2 * W) : 0;
    }

    @Override
    public String toString() {
        return "Rectangle { " +
                "longSize = " + longSize + " cm " +
                ", wideSize = " + wideSize + " cm " +
                ", area = " + area(getLongSize(), getWideSize()) + " cm " +
                ", perimeter = " + perimeter(getLongSize(), getWideSize()) + " cm " +
                '}';
    }
}
