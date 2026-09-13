import java.util.Scanner;

public class Quiz
{
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args)
    {
        int score = 0;

        presentGame();
        score += quiz();
        char grade = (char) evaluateScore(score);
        showResult(score, grade);
    }
    public static void presentGame()
    {
        System.out.println("Welcome to the quiz");
        printDivider();
        System.out.println("The quiz contains 5 questions");
        System.out.println("each with 4 answering options.");
        System.out.println("Type the corresponding number to choose option.");
        System.out.println("Score will be kept, you will be graded.");
        System.out.println("Good luck!");
        printDivider();
        System.out.println("Press Enter to begin");
        scanner.nextLine();
    }
    public static void printDivider()
    {
        System.out.println("====================");
    }
    public static int quiz()
    {
        int score = 0;
        for (int index = 0; index < 5; index++)
        {
            System.out.println("Question number " + (index+1) + ":");
            score += askQuestion("q", new String[4],3 );
        }
        return score;
    }
    public static void showResult(int score, char grade)
    {
        printDivider();
        System.out.println("Score: " + score + "\nGrade: " + grade);
    }
    public static double evaluateScore(int score)
    {
        switch (score)
        {
            case 0 -> {return 'F';}
            case 1 -> {return 'E';}
            case 2 -> {return 'D';}
            case 3 -> {return 'C';}
            case 4 -> {return 'B';}
            case 5 -> {return 'A';}
            default -> {return '-';}
        }
    }
    public static int askQuestion(String questionText, String[] answerOptions, int correctOption)
    {
        int answer;
        System.out.println(questionText);
        for (int index = 0; index < answerOptions.length; index++)
        {
            System.out.println(answerOptions[index]);
        }
        while (true)
        {
            try
            {
                answer = Integer.parseInt(scanner.nextLine());
                if (answer == correctOption)
                {
                    return 1;
                }
                else if (answer <= answerOptions.length && answer > 0)
                {
                    return 0;
                }
                else
                {
                    System.out.println("Not a valid answer, try again.");
                }
            }
            catch (NumberFormatException error)
            {
                System.out.println("Not a valid answer, try again.");
            }
        }
    }
}
// Bygg ett quiz-program som:
// 1. Har 5 frågor med 4 svarsalternativ vardera
// 2. Låter användaren välja svar för varje fråga
// 3. Håller koll på antal rätta svar
// 4. Ger feedback efter varje fråga
// 5. Visar slutresultat och betyg baserat på prestanda