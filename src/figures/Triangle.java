package figures;

public class Triangle extends FigureOptions {
    public Triangle(int height,int sideA,int sideB, int sideC){
        super(height, sideA, sideB, sideC);
    }

    @Override
    public double getPerimeter()
    {
        double perimeter = getSideA() + getSideB() + getSideC();
        return perimeter;
    }
    @Override
    public double getArea()
    {
        double area = (double) (getHeight() + getSideC()) / 2;
        return area;
    }



}
