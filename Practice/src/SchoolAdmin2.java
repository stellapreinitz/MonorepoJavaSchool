import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolAdmin2
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = validateInput(scanner, "Enter number of students: ");
        System.out.println("Number of students: " + numberOfStudents);

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
// 2. För varje student:
//    - Frågar efter namn
//    - Frågar efter 3 betyg
//    - Räknar ut medelbetyg
//    - Avgör om studenten är godkänd (medel >= 60)
// 3. Skriver ut en rapport med:
//    - Alla studenters namn och medelbetyg
//    - Antal godkända studenter
//    - Klassens medelbetyg
