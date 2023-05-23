package figures;

public class FigureOptions {
    private int width;
    private int length;
    private int height;
    private int radius;
    private int sideA;
    private int sideB;
    private int sideC;


    public FigureOptions(int width,int length)
    {
        this.width=width;
        this.length=length;
    }
    public FigureOptions(int height,int sideA,int sideB, int sideC)
    {
        this.height=height;
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    public FigureOptions(int radius)
    {
        this.radius=radius;
    }

}
