import java.util.Scanner;

public class ConsoleUI
{
    Scanner scanner = new Scanner(System.in);

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
    public int presentMenu()
    {
        {
            System.out.println(BOLD + "========MENU========" + RESET);
            System.out.println("1. Show Catalog");
            System.out.println("2. Add track to playlist");
            System.out.println("3. Remove track from playlist");
            System.out.println("4. Show playlist");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        }
    }
    public void displaySongs(Song[] songs)
    {
        for (int index = 0; index < songs.length; index++)
        {
            if (songs[index] != null)
            {
                printDivider();
                System.out.println(BLUE + "Catalogue item " + (index+1) + ":" + RESET);
                System.out.println("Title: " + songs[index].getTitle());
                System.out.println("Artist: " + songs[index].getArtist());
                System.out.println("Duration: " + songs[index].getDurationSeconds() + " seconds");
                if (songs[index].isLong())
                {
                    System.out.println("Long track");
                }
            }
        }
    }
}