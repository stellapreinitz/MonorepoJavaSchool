public class StudentMain
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Lisa Larsson", "Datateknik", new double[]{4.5, 3.8, 4.2, 3.9, 4.0});
        Student student2 = new Student("Karl Karlsson", "Ekonomi", new double[]{2.8, 3.1, 2.9, 3.0, 2.7});
        Student student3 = new Student("Max Muller", "Filosofi", new double[] {3.0,2.1});
        printStudentInfo(student1);
        printStudentInfo(student2);
        printStudentInfo(student3);
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