import java.util.Scanner;

public class ConsoleUI
{
    private static final String PROGRAM_NAME = " -SONG CATALOG APP- ";
    private static final String PROGRAM_AUTHOR = "Stella Preinitz Gärdinge";
    private static final String AUTHOR_COMPANY = "Astral Jellyfish";

    private static final String RESET = "\u001B[0m";
    private static final String BOLD = "\u001B[1m";
    private static final String BLUE = "\u001B[34m";

    Catalogue catalogue = new Catalogue();

    public void printHeader()
    {
        printDivider();
        System.out.println(BOLD + BLUE + PROGRAM_NAME + RESET);
        printDivider();
        System.out.println("Authored by: " + PROGRAM_AUTHOR + "\nat " + AUTHOR_COMPANY);
        printDivider();
        System.out.println();
    }
    public void printDivider()
    {
        System.out.println("====================");
    }
    public void presentMenu(Scanner scanner)
    {
        int choice = 0;
        while (choice != 5)
        {
            System.out.println(BOLD + "========MENU========" + RESET);
            System.out.println("1. Show Catalog");
            System.out.println("2. Add song to playlist");
            System.out.println("3. Remove song from playlist");
            System.out.println("4. Show playlist");
            System.out.println("5. Quit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1 -> catalogue.showCatalogue();
//                case 2 -> addSong();
//                case 3 -> RemoveSong();
//                case 4 -> showPlaylist();
//                case 5 -> System.out.println("Closing application");
//                default -> System.out.println("Invalid choice");
            }
        }
    }
}