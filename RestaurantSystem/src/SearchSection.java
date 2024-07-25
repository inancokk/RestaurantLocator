import java.util.LinkedHashMap;
import java.util.Map;

public class SearchSection extends Restaurant {

    public static void search_name(String name) {
        Map<String, String> name_info = new LinkedHashMap<>();
        for (int i = 0; i < 16; i++) {
            name_info.put(name_array[i], "Name: " + name_array[i] + "  Address: " + address[i] +
                    "  Phone Number: " + telephoneNumber[i] + "  Working Hours: " + workingHours[i]);
        }

        if (name_info.containsKey(name)) {
            System.out.println("\nRestaurant with searched name has found: \n\t" + name_info.get(name) + "\n");
        } else {
            System.out.println("\tRestaurant with name " + name + " is not found. \n");
        }
    }

    public static void search_state(String state) {
        System.out.println("Restaurant(s) in searched area have been found:");
        for (int i = 0; i < 16; i++) {
            if (address[i].contains(state)) {
                System.out.println("\tName: " + name_array[i] + "  Address: " + address[i] +
                        "  Phone Number: " + telephoneNumber[i] + "  Working Hours: " + workingHours[i]);
            }
        }
    }
}
