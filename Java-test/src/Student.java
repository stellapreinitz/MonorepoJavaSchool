public class Student
{
    private static final int ADULT_AGE = 18;
    private String name;
    private int age;
    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public boolean isAdult()
    {
        return age >= ADULT_AGE;
    }
    @Override
    public String toString()
    {
        return name + ", age: " + age;
    }
}
