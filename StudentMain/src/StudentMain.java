import java.util.ArrayList;

public class StudentMain
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Lisa Larsson", 31, "Datateknik", StudyLevel.INTERMEDIATE, new double[]{4.5, 3.8, 4.2, 3.9, 4.0}));
        students.add(new Student("Karl Karlsson", 17, "Ekonomi", StudyLevel.ADVANCED, new double[]{2.8, 3.1, 2.9, 3.0, 2.7}));
        students.add(new Student("Max Muller", 21, "Filosofi", StudyLevel.BEGINNER, new double[] {3.0,2.1}));
        try
        {
            students.add(new Student(" ", -20, "Filosofi", StudyLevel.BEGINNER, new double[] {3.0,2.1}));
            System.out.println(students.indexOf(students.size()));
        }
        catch (IllegalArgumentException invalidStudent)
        {
            System.out.println("Couldn't create student" + invalidStudent.getMessage());
        }
        for (Student student : students)
        {
            printStudentInfo(student);
        }
        printAdultStudents(students);
    }
    public static void printStudentInfo(Student student)
    {
        System.out.println(student);
        printDivider();
    }
    public static void printDivider()
    {
        System.out.println("====================");
    }
    public static void printAdultStudents(ArrayList<Student> students)
    {
        printDivider();
        System.out.println("Adult students: ");
        for (Student student : students)
        {
            if (student.isAdult())
            {
                System.out.println(student.getStudentname());
            }
        }
    }
}