public enum MusicGenre
{
    SYNTHPOP("Synthpop"),
    PUNKROCK("Punkrock"),
    ELECTROPOP("Electropop"),
    INDIEROCK("Indierock");

    private final String label;

    MusicGenre (String label)
    {
        this.label = label;
    }

    @Override
    public String toString()
    {
        return this.label;
    }
}