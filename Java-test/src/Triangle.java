public class Triangle implements Shape, ShapeWithSides
{
    private double height;
    private double width;

    public Triangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    public int getSidesCount()
    {
        return 3;
    }

    @Override
    public double getArea()
    {
        return height * width / 2;
    }

    @Override
    public double getHeight()
    {
        return height;
    }

    @Override
    public double getWidth()
    {
        return width;
    }
}
