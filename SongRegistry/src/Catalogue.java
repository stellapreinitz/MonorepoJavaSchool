import java.util.ArrayList;

public class Catalogue
{
    ArrayList<Song> catalogue = new ArrayList<>();
    public Catalogue()
    {
        catalogue.add (new Song("Bury It", "Chvrches", MusicGenre.SYNTHPOP, 188));
        catalogue.add (new Song("Homecoming","Green Day", MusicGenre.PUNKROCK, 558));
        catalogue.add (new Song("Time Machine", "Robyn", MusicGenre.ELECTROPOP, 214));
        catalogue.add (new Song("Primadonna", "MARINA", MusicGenre.ELECTROPOP,218));
        catalogue.add (new Song("Never Ending Circles", "Chvches", MusicGenre.SYNTHPOP, 186));
        catalogue.add (new Song("Helgen v.48", "bob hund", MusicGenre.INDIEROCK, 193));
        try
        {
            {
                catalogue.add (new Song(" ", "Gloob Floop", MusicGenre.SYNTHPOP, 333));
            }
        }
        catch (IllegalArgumentException error)
        {
            System.out.println("Couldn't create song " + error.getMessage());
        }
    }
    public ArrayList<Song> getAllSongs()
    {
        return catalogue;
    }
}