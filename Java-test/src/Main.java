import java.util.ArrayList;

public class Main
{
    static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ripley", 25));
        students.add(new Student("Kane", 35));
        students.add(new Student("Bishop", 58));
        students.add(new Student("Newt", 7));

        System.out.println("Number of students: " + students.size());

        System.out.println("\n===All Students===");
        for (Student student : students)
        {
            printDivider();
            System.out.println(student.toString());
        }
        System.out.println("\n===Adult Students===");
        for (Student student : students)
        {
            if (student.isAdult())
            {
                System.out.println(student);
            }
        }
    }
    public static void printDivider()
    {
        System.out.println("----------");
    }
}