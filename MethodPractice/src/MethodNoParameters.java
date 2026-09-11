public class MethodNoParameters
{
    static void main(String[] args)
    {
        printDividerParameterized("#");
        System.out.println("This is a public service announcement, this is only a test");
        printDivider();
        System.out.println("Emergency evacuation protest");
        printDivider();
        System.out.println("May impair your ability to operate machinery");
        System.out.println("Can't quite tell just what it means to me");
        printDividerParameterized("*");
        System.out.println("Keep out of reach of children, don't talk to strangers");
        System.out.println("Get your philosophy from a bumper sticker");
        printDividerParameterized("#");
    }

    public static void printDivider()
    {
        System.out.println("--------------------");
    }

    public static void printDividerParameterized(String character)
    {
        final int dividerCount = 20;
        for (int index = 0; index < dividerCount; index++)
        {
            System.out.print(character);
        }
        System.out.println();
    }
}