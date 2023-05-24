package figures;

public class Circle extends FigureOptions {
    public Circle(int radius) {
        super(radius);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*Math.PI*getRadius();
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = Math.PI*(getRadius()*getRadius());
        return area;
    }
}