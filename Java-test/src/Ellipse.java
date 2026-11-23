public class Ellipse implements Shape
{
    private double height;
    private double width;

    public Ellipse(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return width * 0.5 * height * 0.5 * Math.PI;
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
