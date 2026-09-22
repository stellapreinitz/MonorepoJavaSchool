public class Rectangle implements IsShape
{
    double height;
    double width;
    String shape = "Rectangle";

    public Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }
    public double calculateArea()
    {
        return height * width;
    }
    public double calculateCircumference()
    {
        return (height * 2) + (width * 2);
    }
    public double getHeight()
    {
        return height;
    }
    public double getWidth()
    {
        return width;
    }
    public String getShape()
    {
        return shape;
    }
}
