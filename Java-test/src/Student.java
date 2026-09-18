public class Student
{
    private static final int ADULT_AGE = 18;
    private boolean isAdult = false;
    private String name;
    private int age;
    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        if (age >= ADULT_AGE)
        {
            this.isAdult = true;
        }
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
        System.out.println("Is adult: " + isAdult);
    }
    @Override
    public String toString()
    {
        return name + ", age: " + age + ", Is adult: " + isAdult;
    }
}
