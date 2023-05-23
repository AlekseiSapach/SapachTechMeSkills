package figures;

public class Rectangle extends FigureOptions {
    public Rectangle(int width, int length) {
        super(width, length);
    }

    void getRectanglePerimeter(){
        int perimeter = 2*(getWidth()+getLength());
        System.out.println(perimeter);
    }
    void getRectangleArea(){
        int area =getLength()*getWidth() ;
        System.out.println(area);
    }
}