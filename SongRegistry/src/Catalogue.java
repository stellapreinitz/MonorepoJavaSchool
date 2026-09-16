public class Catalogue
{
    Song[] catalogue;
    public Catalogue()
    {
        catalogue = new Song[10];
        catalogue[0] = new Song("Bury It", "Chvrches", 188);
    }
    public void showCatalogue()
    {
        for (int index = 0; index < catalogue.length; index++)
        {
            if (catalogue[index] != null)
            {
                System.out.println(catalogue[index].getTitle());
                System.out.println(catalogue[index].getArtist());
                System.out.println(catalogue[index].getDurationSeconds());
            }
        }
    }
}