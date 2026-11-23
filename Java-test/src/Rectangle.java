public class Rectangle implements Shape, ShapeWithSides
{
    private double height;
    private double width;

    public Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    public int getSidesCount()
    {
        return 4;
    }

    @Override
    public double getArea()
    {
        return height * width;
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
