public class Song
{
    private String title;
    private String artist;
    private int durationSeconds;

    public Song(String title, String artist, int durationSeconds)
    {
        this.title = title;
        this.artist = artist;
        this. durationSeconds = durationSeconds;
    }
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    public int getDurationSeconds()
    {
        return durationSeconds;
    }
    public int setDurationSeconds(int durationSeconds)
    {
        if (durationSeconds > 0)
        {
            this.durationSeconds = durationSeconds;
        }
        else
        {
            System.out.println("Duration must be at least 1 second");
        }
        return durationSeconds;
    }
    public boolean isLong()
    {
        return durationSeconds >= 240;
    }
    @Override
    public String toString()
    {
        return title + ", " + artist + ", Length: " + durationSeconds;
    }
}
