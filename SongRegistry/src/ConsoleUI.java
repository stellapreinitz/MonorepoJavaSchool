public class ConsoleUI
{
    private static final String PROGRAMNAME = " -SONG CATALOG APP- ";
    private static final String PROGRAMAUTHOR = "Stella Preinitz Gärdinge";
    private static final String AUTHORCOMPANY = "Astral Jellyfish";

    private static final String RESET = "\u001B[0m";
    private static final String BOLD = "\u001B[1m";
    private static final String BLUE = "\u001B[34m";

    public static void printHeader()
    {
        printDivider();
        System.out.println(BOLD + BLUE + PROGRAMNAME + RESET);
        printDivider();
        System.out.println("Authored by: " + PROGRAMAUTHOR + "\nat " + AUTHORCOMPANY);
        printDivider();
        System.out.println();
    }
    public static void printDivider()
    {
        System.out.println("====================");
    }
    public static void presentMenu()
    {
            System.out.println(BOLD + "========MENU========" + RESET);
            System.out.println("1. Show Catalog");
            System.out.println("2. Add song to playlist");
            System.out.println("3. Remove song from playlist");
            System.out.println("4. Show playlist");
            System.out.println("5. Quit");
    }
}