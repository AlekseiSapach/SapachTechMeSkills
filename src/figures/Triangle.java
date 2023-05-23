package figures;

public class Triangle extends FigureOptions {
    public Triangle(int height,int sideA,int sideB, int sideC){
        super(height, sideA, sideB, sideC);
    }
    private int perimeter;

    void getTriangle(){
        perimeter=getSideA()+getSideB()+getSideC();
        System.out.println(perimeter);
    }


}
