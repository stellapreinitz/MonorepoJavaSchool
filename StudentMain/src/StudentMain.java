import java.util.ArrayList;

public class StudentMain
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Lisa Larsson", "Datateknik", new double[]{4.5, 3.8, 4.2, 3.9, 4.0}));
        students.add(new Student("Karl Karlsson", "Ekonomi", new double[]{2.8, 3.1, 2.9, 3.0, 2.7}));
        students.add(new Student("Max Muller", "Filosofi", new double[] {3.0,2.1}));

        for (Student student : students)
        {
            printStudentInfo(student);
        }
    }
    public static void printStudentInfo(Student student)
    {
        System.out.println(student.getStudentname());
        System.out.println(student.getCourse());
        System.out.println("Average grade: " + student.calculateAverage());
        System.out.println(student.evaluateGrades());
        printDivider();
    }
    public static void printDivider()
    {
        System.out.println("====================");
    }
}