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

        System.out.println("Number of stundets: " + students.size());

        System.out.println("\n===All Students===");
        for (Student student : students)
        {
            printDivider();
            student.printInfo();
        }
    }
    public static void printDivider()
    {
        System.out.println("----------");
    }
}