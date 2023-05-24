package figures;

public class Rectangle extends FigureOptions {
    public Rectangle(int width, int length) {
        super(width, length);
    }

    @Override
    public double getPerimeter()
    {
        double perimeter = 2*(getWidth()+getLength());
        return perimeter;
    }
    @Override
    public double getArea()
    {
        int area =getLength()*getWidth() ;
        return area;
    }
}