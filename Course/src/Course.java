public class Course
{
    private String name;
    private int age;

    Course(String localName)
    {
        name = localName;
        age = 6;
    }

    public String getName()
    {
        return name;
    }

    static void main(String[] args)
    {
        Course java = new Course("Programming");
        System.out.println(java.getName());
    }
}
