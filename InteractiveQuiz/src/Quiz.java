import java.util.Scanner;

public class Quiz
{
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args)
    {
        int score = 0;
        String grade;

        presentGame();
        askQuestions();
        //showResult(score, grade = evaluateScore(score));
    }
    public static void presentGame()
    {
        System.out.println("Welcome to the quiz");
        printDivider();
        System.out.println("The quiz contains 5 questions");
        System.out.println("each with 4 answering options.");
        System.out.println("Score will be kept, you will be graded.");
        System.out.println("Good luck!");
        printDivider();
        System.out.println("Press any key to begin");
        scanner.nextLine();
    }
    public static void printDivider()
    {
        System.out.println("====================");
    }
    public static void askQuestions()
    {
        for (int index = 0; index < 5; index++)
        {
            System.out.println("Question number " + index + ":");
        }
    }
}
// Bygg ett quiz-program som:
// 1. Har 5 frågor med 4 svarsalternativ vardera
// 2. Låter användaren välja svar för varje fråga
// 3. Håller koll på antal rätta svar
// 4. Ger feedback efter varje fråga
// 5. Visar slutresultat och betyg baserat på prestanda