public class Student
{
    private String name;
    private String course;
    private double[] grades;
    private int age;
    private int adultAge = 18;
    private StudyLevel level;

    public Student(String name, int age, String course, StudyLevel level, double[] grade)
    {
        setStudentName(name);
        setAge(age);
        setLevel(level);
        this.course = course;
        this.grades = grade;
    }
    public double calculateAverage()
    {
        double sum = 0;
        for (double grade : grades)
        {
            sum += grade;
        }
        return sum / grades.length;
    }
    public String evaluateGrades()
    {
        String status = calculateAverage() >= 3.0 ? "Passed" : "Failed";
        return status;
    }
    public String getStudentname()
    {
        return name;
    }
    public void setStudentName(String name)
    {
        if (name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Name must be given!");
        }
        this.name = name;
    }
    public String getCourse()
    {
        return course;
    }
    public boolean isAdult()
    {
        return age >= adultAge;
    }
    public StudyLevel getLevel()
    {
        return level;
    }
    public void setAge(int age)
    {
        if (age < 0 || age > 120)
        {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        this.age = age;
    }
    public void setLevel(StudyLevel level)
    {
        this.level = level;
    }
    @Override
    public String toString()
    {
        return "Name: " + name +
                " \nAge: " + age +
                " \nIs adult: " + isAdult() +
                " \nCourse: " + course +
                " \nStudy level: " + level +
                " \nGrades average: " + calculateAverage() +
                " \nEvaluation: " + evaluateGrades()
                ;
    }
}