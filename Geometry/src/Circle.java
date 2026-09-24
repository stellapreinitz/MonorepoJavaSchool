public class Circle implements IsShape
{
    double radius;
    String shape = "Circle";

    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double calculateArea()
    {
        return radius * radius * Math.PI;
    }
    public double calculateCircumference()
    {
        return 2 * Math.PI * radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public String getShape()
    {
        return shape;
    }
}