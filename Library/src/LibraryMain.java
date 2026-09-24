public class LibraryMain
{
    public static void main(String[] args)
    {
        Library library = new Library();
        User user = new User("Maria Svensson", "U001");
        for (Book book : library.getBooks())
        {
            System.out.println(book);
        }
        System.out.println(user);
        //user.borrowBook(0);
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