package figures;

public class Triangle extends FigureOptions {
    public Triangle(int height,int sideA,int sideB, int sideC){
        super(height, sideA, sideB, sideC);
    }

    void getTrianglePerimeter(){
        int perimeter = getSideA() + getSideB() + getSideC();
        System.out.println(perimeter);
    }
    void getTriangleArea(){
        double area = (double) (getHeight() + getSideC()) / 2;
        System.out.println(area);
    }



}
