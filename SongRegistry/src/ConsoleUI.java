import java.util.ArrayList;
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
            System.out.println("2. Show long songs");
            System.out.println("3. Add track to Playlist");
            System.out.println("4. Remove track from playlist");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        }
    }
    public void displaySongs(ArrayList<Song> songs)
    {
        printDivider();
        System.out.println(BLUE + "Number of songs: " + songs.size() + RESET);
        for (Song song : songs)
        {
            System.out.print(song.toString());
            if (song.isLong())
            {
                System.out.println(", Long track");
            }
            else
            {
                System.out.println();
            }
        }
    }
    public void displayLongSong(ArrayList<Song> songs)
    {
        for (Song song : songs)
        {
            if (song.isLong())
            {
                System.out.println(song);
            }
        }
    }
}