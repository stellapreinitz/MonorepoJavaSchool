import java.util.Scanner;

public class SchoolAdmin2
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = validateInput(scanner, "Enter number of students: ");
        System.out.println("Number of students: " + numberOfStudents);
        String[] arrayStudents = new String[numberOfStudents];
        int[] averageTestScores = new int[numberOfStudents];

        for (int indexStudents = 0; indexStudents < arrayStudents.length; indexStudents++)
        {
            int testScoreSum = 0;
            System.out.println("Enter name of student " + (indexStudents + 1 ) + ":");
            arrayStudents[indexStudents] = scanner.nextLine();
            for (int indexTestScore = 0; indexTestScore < 3; indexTestScore++)
            {
                int testScore = validateInput(scanner, "Enter score on test: "  + (indexTestScore + 1 ));
                testScoreSum += testScore;
            }
            averageTestScores[indexStudents] = testScoreSum / 3;
        }
        for (int index = 0; index < arrayStudents.length; index++)
        {
            System.out.println("Student: "+ arrayStudents[index]);
            System.out.println("Average score: " + averageTestScores[index]);
        }
    }
    //Metod validerar om input är ett positivt heltal. Kan återanvändas vid alla tillfällen där input förväntas vara int>0.
    public static int validateInput(Scanner scanner, String prompt)
    {
        while (true)
        {
            System.out.println(prompt);
            String input = scanner.nextLine();
            try
            {
                int number = Integer.parseInt(input);
                if (number > 0)
                {
                    return number;
                }
                else
                {
                    System.out.println("Invalid input, use positive intger.");
                }
            }
            catch (NumberFormatException error)
            {
                System.out.println("Invalid input, use positive intger.");
            }
        }
    }
}
// Skapa ett program som:
// 1. Frågar efter antal studenter X
// 2. För varje student:    X
//    - Frågar efter namn   X
//    - Frågar efter 3 betyg    X
//    - Räknar ut medelbetyg    X
//    - Avgör om studenten är godkänd (medel >= 60)
// 3. Skriver ut en rapport med:
//    - Alla studenters namn och medelbetyg
//    - Antal godkända studenter
//    - Klassens medelbetyg
