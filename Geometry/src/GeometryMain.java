public class GeometryMain {
    public static void main(String[] args)
    {
        Rectangle rectangle1 = new Rectangle (5.0, 3.0);
        Circle circle1 = new Circle (4.0);
        Circle circle2 = new Circle (5.5);

        System.out.println("Rectangle: " + rectangle1.getHeight() + " x " + rectangle1.getWidth());
        System.out.println("Area: " + rectangle1.calculateArea());
        System.out.println("Circumference: " + rectangle1.calculateCircumference());

        printDivider();

        System.out.println("Circle with radius: " + circle1.getRadius());
        System.out.println("Area: " + String.format("%.2f", circle1.calculateArea()));
        System.out.println("Circumference: " + String.format("%.2f", circle1.calculateCircumference()));

        printDivider();

        compareAreas(circle2, rectangle1);
    }
    public static void printDivider()
    {
        System.out.println("====================");
    }
    public static void compareAreas(IsShape area1, IsShape area2)
    {
        if (area1.calculateArea() > area2.calculateArea())
        {
            System.out.println(area1.getShape() + " has a larger area than " + area2.getShape());
        }
        else
        {
            System.out.println(area2.getShape() + " has a larger area than " + area1.getShape());
        }
    }
}