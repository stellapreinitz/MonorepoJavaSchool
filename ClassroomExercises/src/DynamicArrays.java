import java.util.Scanner;

public class DynamicArrays
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you wish to register?");
        int numbersSize = scanner.nextInt();
        int[] numbers = new int[numbersSize];
        int sum = 0;

        System.out.println("Array size: " + numbers.length);

        for (int index = 0; index < numbers.length; index++)
        {
            System.out.println("Enter value of number " + (index + 1));
            numbers[index] = scanner.nextInt();
            sum += numbers[index];
        }
        System.out.println("Your numbers: ");
        for (int index = 0; index < numbers.length; index++)
        {
            System.out.println("Number " + (index +1 ) + ": " + numbers[index]);
        }
        System.out.println("The sum of entered numbers is: " + sum);
    }
}