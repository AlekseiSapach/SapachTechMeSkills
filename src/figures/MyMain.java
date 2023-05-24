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
            figureOptions.getData();
            //System.out.println(figureOptions.getPerimeter());
            System.out.println();
        }
        for (int index=0;index< figure.length;index++)
        {
            figure[0].getPerimeter();
            figure[1].getPerimeter();
            figure[2].getPerimeter();
            figure[3].getPerimeter();
            figure[4].getPerimeter();

        }






    }
}
