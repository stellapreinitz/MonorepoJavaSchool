//LEGACY CODE, ENTIRELY REPLACED BY SCHOOLADMIN2
//LEGACY CODE, ENTIRELY REPLACED BY SCHOOLADMIN2
//LEGACY CODE, ENTIRELY REPLACED BY SCHOOLADMIN2
//LEGACY CODE, ENTIRELY REPLACED BY SCHOOLADMIN2

//Import Scanner for use of input, InputMismatchException for input handling

import java.util.Scanner;
import java.util.InputMismatchException;

public class SchoolAdmin
{
    static void main(String[] args)
    {
        //Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        //Bool makes sure while-loop starts
        boolean validNumberOfStudents = false;
        boolean validScore = false;
        //Creates a null variable array that can be filled later
        String[] namesOfStudents = null;
        //Creates a null variable 2D array to store test scores for every student
        int[][] scores = null;
        //CLARIFICATION 1 array for student names, 1 separate 2D array for test scores.
        //Scores can be matched to names by looking at index in both arrays.

        //Null variable array to score averages for each student, this follows the same array pattern, index matches student names
        double[] studentAverages = null;

        //Field declarations for variables used throughout class
        int numberOfStudents = 0;
        int studentIndex = 0;
        int testIndex = 0;

        //Initiates loop to collect all inputs
        while (!validNumberOfStudents)
        {
            System.out.println("Enter number of students: ");
            //Try only initiates when correct type is input (int)
            try
            {
                numberOfStudents = scanner.nextInt();
                scanner.nextLine();
                //Valid input, exits loop
                validNumberOfStudents = true;
                //Creates array with input specified size using the null variable from line 16
                namesOfStudents = new String[numberOfStudents];
                //Creates 2D array from line 18, same size as namesOfStudents in one dimension, 3 in the other dimension
                scores = new int[numberOfStudents][3];
                //Creates array of same size as the other arrays
                studentAverages = new double[numberOfStudents];

                //Names every index in array
                for (int i = 0; i < numberOfStudents; i++)
                {
                    System.out.println("Enter name of student " + (i + 1));
                    namesOfStudents[i] = scanner.nextLine();
                }

                //Loop checks every student
                for (studentIndex = 0; studentIndex < numberOfStudents; studentIndex++)
                {
                    //Nested loop checks every test, for every student (2D array)
                    for (testIndex = 0; testIndex < 3; testIndex++)
                    {
                        //Resets loop status for next test score (see comment line 72)
                        validScore = false;

                        while (!validScore)
                        {
                            //Lets user specify every test score, for every student
                            System.out.println("Enter score for " + namesOfStudents[studentIndex] + " on test " + (testIndex+1) + ": ");
                            try
                            {
                                scores[studentIndex][testIndex] = scanner.nextInt();
                                scanner.nextLine();
                                //Exits input loop for one specific test score
                                validScore = true;
                            }
                            //Loop continues when input is invalid
                            catch (InputMismatchException error)
                            {
                                System.out.println("Invalid input, please use integers.");
                                scanner.nextLine();
                            }
                        }
                    }
                }
            }
            //Catch initiates when input is not int, prints error message, loop continues
            catch (InputMismatchException error)
            {
                System.out.println("Invalid input, please use integers.");
                scanner.nextLine();
            }
        }

        System.out.println("Score averages per student: ");

        //Nested loop reaches into 2D array
        for (studentIndex = 0; studentIndex < numberOfStudents; studentIndex++)
        {
            //Resets sum for every student
            int sum = 0;

            for (testIndex = 0; testIndex < 3; testIndex++)
            {
                sum += scores[studentIndex][testIndex];
            }

            double average = sum / 3;

            //PLACEHOLDER PRINT STATEMENT, CONTINUE HERE
            System.out.println(namesOfStudents[studentIndex] + " - Average score: " + average);
        }
    }
}
// Skapa ett program som:
// 1. Frågar efter antal studenter
// 2. För varje student:
//    - Frågar efter namn
//    - Frågar efter 3 betyg
//    - Räknar ut medelbetyg
//    - Avgör om studenten är godkänd (medel >= 60)
// 3. Skriver ut en rapport med:
//    - Alla studenters namn och medelbetyg
//    - Antal godkända studenter
//    - Klassens medelbetyg

//LEGACY CODE, ENTIRELY REPLACED BY SCHOOLADMIN2
//LEGACY CODE, ENTIRELY REPLACED BY SCHOOLADMIN2
//LEGACY CODE, ENTIRELY REPLACED BY SCHOOLADMIN2
//LEGACY CODE, ENTIRELY REPLACED BY SCHOOLADMIN2