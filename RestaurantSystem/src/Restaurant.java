public class Restaurant {
    // Koordinatlar ve bilgiler
    static double[] rest_x_coordinates = {41.005, 41.015, 41.025, 41.035, 41.045}; // Koordinatlar
    static double[] rest_y_coordinates = {28.975, 28.985, 28.995, 29.005, 29.015}; // Koordinatlar
    static String[] name_array = {"Sunset Cafe", "Şehir Lokantası", "Lezzet Noktası", "Şehir Restoranı", "Nehrin Kenarı Grili"};
    static String[] address = {
            "Kadıköy, İstanbul",
            "Beşiktaş, İstanbul",
            "Şişli, İstanbul",
            "Beyoğlu, İstanbul",
            "Fatih, İstanbul"
    };
    static String[] telephoneNumber = {
            "212-123-4567",
            "212-234-5678",
            "212-345-6789",
            "212-456-7890",
            "212-567-8901"
    };
    static String[] workingHours = {
            "Pazartesi - Cuma 09:00 - 22:00",
            "Pazartesi - Cuma 10:00 - 23:00",
            "Pazartesi - Cumartesi 08:00 - 23:00",
            "Pazartesi - Pazar 07:00 - 24:00",
            "Pazartesi - Cumartesi 09:00 - 21:00"
    };
    static String[] description = {
            "Sunset Cafe, Kadıköy'ün gözde mekanlarından biridir. Gün batımında harika manzarasıyla rahatlatıcı bir atmosfer sunar.",
            "Şehir Lokantası, Beşiktaş'ta geleneksel Türk mutfağının en güzel örneklerini sunar. Sıcak ve samimi bir ortamda yemek keyfi yaşatır.",
            "Lezzet Noktası, Şişli'de modern bir atmosferde lezzetli yemekler sunar. Günün her saati açık olan mekan, çeşitli menüsüyle dikkat çeker.",
            "Şehir Restoranı, Beyoğlu'nda yer alan popüler bir mekandır. Hem öğle hem de akşam yemekleri için geniş bir menü sunar.",
            "Nehrin Kenarı Grili, Fatih'te mükemmel bir manzara eşliğinde ızgara çeşitleri sunar. Rahat bir atmosferde lezzetli yemekler servis eder."
    };

    public static void listInfo() {

        System.out.println("\nSana en yakın 5 restoranın bilgileri:");
        Location.calculateDistance();
    }

    public static void listAllRestaurants() {
        System.out.println("\nTüm restoranların bilgileri:");
        for (int i = 0; i < name_array.length; i++) {
            System.out.println("\nRestoran İsmi: " + name_array[i]);
            System.out.println("Adres: " + address[i]);
            System.out.println("Telefon: " + telephoneNumber[i]);
            System.out.println("Çalışma Saatleri: " + workingHours[i]);
            System.out.println("Tanıtım: " + description[i]);
        }
    }
}
