public class LibraryMain
{
    public static void main(String[] args)
    {
        Library library = new Library();
        for (Book book : library.books)
        {
            System.out.println(book.toString());
        }

//        // Användare
//        String användarNamn = "Maria Svensson";
//        String användarId = "U001";
//        String[] lånadeBöcker = new String[5]; // Max 5 böcker
//        int antalLånadeBöcker = 0;
//
//        // Låna bok (bok index 0 - "1984")
//        int bokIndex = 0;
//        if (bokTillgänglig[bokIndex] && antalLånadeBöcker < 5) {
//            lånadeBöcker[antalLånadeBöcker] = bokTitlar[bokIndex];
//            antalLånadeBöcker++;
//            bokTillgänglig[bokIndex] = false;
//            System.out.println(användarNamn + " lånade: " + bokTitlar[bokIndex]);
//        }
//
//        // Visa lånade böcker
//        System.out.println("\n" + användarNamn + "s lånade böcker:");
//        for (int i = 0; i < antalLånadeBöcker; i++) {
//            System.out.println("- " + lånadeBöcker[i]);
//        }
//
//        // Visa tillgängliga böcker
//        System.out.println("\nTillgängliga böcker:");
//        for (int i = 0; i < bokTitlar.length; i++) {
//            if (bokTillgänglig[i]) {
//                System.out.println("- " + bokTitlar[i] + " av " + bokFörfattare[i] + " (" + bokSidor[i] + " sidor)");
//            }
//        }
    }
}