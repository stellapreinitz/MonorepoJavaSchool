public class Student
{
    String name;
    String course;
    double[] grades;

    public Student(String name, String course, double[] grade)
    {
        this.name = name;
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
        String status = calculateAverage() >= 3.0 ? "Godkänd" : "Underkänd";
        return status;
    }
    public String getStudentname()
    {
        return name;
    }
    public String getCourse()
    {
        return course;
    }
}
