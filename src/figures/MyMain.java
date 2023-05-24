package figures;
public class MyMain {
    public static void main(String[] args) {
        double summa=0;
        FigureOptions[] figure=
        {
            new Triangle(5,10,10,10),
            new Rectangle(10,20),
            new Circle(5),
            new Rectangle(15,10),
            new Triangle(3,5,4,7)
        };
        for (FigureOptions figureOptions:figure)
        {
            summa=summa+figureOptions.getPerimeter();
        }
        System.out.println("Сумму периметра всех фигур в массиве: "+summa);

    }
}
