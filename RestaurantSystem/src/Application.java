public class Application {
    static String GLOBAL_NETWORK = "Global Restaurant Network";
    static int foundingYear = 1990;
    static String closingLine = "Afiyet olsun!";

    public static void open() {
        System.out.println("\n" + GLOBAL_NETWORK + " - founded in " + foundingYear);
    }

    public static void close() {
        System.out.println("\n" + closingLine);
    }

    public static void main(String[] args) {
        open();
        Restaurant.listInfo();
        close();
    }
}
