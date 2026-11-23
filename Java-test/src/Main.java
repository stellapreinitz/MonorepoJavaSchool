import java.util.ArrayList;
import java.util.List;

public class Main
{
    static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(4.5, 3.0);
        Triangle t1 = new Triangle(4.5, 3.0);
        Ellipse e1 = new Ellipse(2.5, 3.5);


        List<Shape> shapes = new ArrayList<>();

        shapes.add(r1);
        shapes.add(t1);
        shapes.add(e1);

        List<ShapeWithSides> shapeWithSides = new ArrayList<>();

        shapeWithSides.add(r1);
        shapeWithSides.add(t1);

        for (Shape  s : shapes)
            System.out.println(s.getArea());

        for (ShapeWithSides s : shapeWithSides)
            System.out.println(s.getSidesCount());
    }
}