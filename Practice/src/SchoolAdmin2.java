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
        int passingStudents = 0;
        int classAccumulated = 0;
        int numberOfTests = 3;

        for (int indexStudents = 0; indexStudents < arrayStudents.length; indexStudents++)
        {
            int testScoreSum = 0;
            System.out.println("Enter name of student " + (indexStudents + 1 ) + ":");
            arrayStudents[indexStudents] = scanner.nextLine();
            for (int indexTestScore = 0; indexTestScore < numberOfTests; indexTestScore++)
            {
                int testScore = validateInput(scanner, "Enter score on test: "  + (indexTestScore + 1 ));
                testScoreSum += testScore;
            }
            averageTestScores[indexStudents] = testScoreSum / numberOfTests;
            if (averageTestScores[indexStudents]>= 60)
            {
                System.out.println(arrayStudents[indexStudents] + " has reached a passing grade.");
                passingStudents++;
            }
            else
            {
                System.out.println(arrayStudents[indexStudents] + " has not reached a passing grade.");
            }
        }
        for (int indexStudents = 0; indexStudents < arrayStudents.length; indexStudents++)
        {
            System.out.println("Student: "+ arrayStudents[indexStudents]);
            System.out.println("Average score: " + averageTestScores[indexStudents]);
            classAccumulated += averageTestScores[indexStudents];
        }
        double classAverage = (double) classAccumulated / numberOfStudents;
        System.out.println(passingStudents + " student(s) reached a passing grade.");
        System.out.println("Class average is: " + classAverage);
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
                    System.out.println("Invalid input, use positive integer.");
                }
            }
            catch (NumberFormatException error)
            {
                System.out.println("Invalid input, use positive integer.");
            }
        }
    }
}