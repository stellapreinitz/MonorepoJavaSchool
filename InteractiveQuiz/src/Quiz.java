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
        //when adding or removing questions, make sure to edit the assignments of questions[] AND numberOfQuestions in synch
        int score = 0;
        int numberOfQuestions = 5;
        QuizQuestion[] questions = new QuizQuestion[numberOfQuestions];
        questions[0] = new QuizQuestion
                ("What does the Java keyword char mean?",
                new String[] {
                        "1. It stores a single letter, number or symbol",
                        "2. A pointer type that stores the memory address of a string array",
                        "3. Short for \"characteristic value\", a data type used to hold the exponent part of a float",
                        "4. It purges a variable from memory"},
                1
                );
        questions[1] = new QuizQuestion
                ("What does OOP mean in the context of programming?",
                        new String[] {
                                "1. Order of parsing",
                                "2. Object ordered parameter",
                                "3. Object oriented programming",
                                "4. Orthodox object pointer"},
                        3
                );
        questions[2] = new QuizQuestion
                ("Which are the possible values of a boolean in Java?",
                        new String[] {
                                "1. 0 or 1",
                                "2. true or false",
                                "3. Any value between 0.0 and 1.0",
                                "4. true, false or null"},
                        2
                );
        questions[3] = new QuizQuestion
                ("What is does the operator \"==\" do?",
                        new String[] {
                                "1. Compares any values to check in they are the same",
                                "2. Assigns value to a variable",
                                "3. Compares any primitive types to check if their values are the same",
                                "4. Compares any compatible primitive types to check if their values are the same"},
                        4
                );
        questions[4] = new QuizQuestion
                ("Do all Java programs need a main method?",
                        new String[] {
                                "1. Yes, always",
                                "2. No, never",
                                "3. No, not if the program has another entry point",
                                "4. Yes, except in Java 26"},
                        3
                );
        for (int index = 0; index < questions.length; index++)
        {
            System.out.println("Question number " + (index+1) + ":");
            score += askQuestion(questions[index]);
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
    public static int askQuestion(QuizQuestion question)
    {
        int answer;
        System.out.println(question.questionPrompt);
        for (int index = 0; index < question.questionAlternatives.length; index++)
        {
            System.out.println(question.questionAlternatives[index]);
        }
        while (true)
        {
            try
            {
                answer = Integer.parseInt(scanner.nextLine());
                if (answer == question.questionSolution)
                {
                    System.out.println("Correct!");
                    printDivider();
                    return 1;
                }
                else if (answer <= question.questionAlternatives.length && answer > 0)
                {
                    System.out.println("Incorrect.");
                    printDivider();
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
class QuizQuestion
{
    String questionPrompt;
    String[] questionAlternatives;
    int questionSolution;

    public QuizQuestion(String questionPrompt, String[] questionAlternatives, int questionSolution)
    {
        this.questionPrompt = questionPrompt;
        this.questionAlternatives = questionAlternatives;
        this.questionSolution = questionSolution;
    }
}