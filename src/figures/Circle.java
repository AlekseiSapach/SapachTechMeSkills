package figures;

public class Circle extends FigureOptions {
    public Circle(int radius) {
        super(radius);
    }

    void getCirclePerimeter() {
        double perimeter = 2*3.14*getRadius();
        System.out.println(perimeter);
    }

    void getCircleArea() {
        double area = 3.14*(getRadius()*getRadius());
        System.out.println(area);
    }
}