package figures;

public abstract class FigureOptions  {
    private int width;
    private int length;
    private int height;
    private int radius;
    private int sideA;
    private int sideB;
    private int sideC;


    public FigureOptions(int width, int length)
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

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getRadius() {
        return radius;
    }
    void getData()
    {
        System.out.println("width = "+this.width);
        System.out.println("length = "+this.length);
        System.out.println("height = "+this.height);
        System.out.println("radius = "+this.radius);
        System.out.println("sideA = "+this.sideA);
        System.out.println("sideB = "+this.sideB);
        System.out.println("sideC = "+this.sideC);
    }



    public abstract double getArea();
    public abstract double getPerimeter();
}
