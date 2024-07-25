import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Location extends Restaurant {
    static Double[] distance = new Double[5];
    static double x_coordinates = (Math.random() * 100);
    static double y_coordinates = (Math.random() * 100);

    public static void calculateDistance() {
        ArrayList<Double> list = new ArrayList<>();
        Map<Double, String> information = new LinkedHashMap<>();

        for (int i = 0; i < rest_x_coordinates.length; i++) {
            distance[i] = Math.pow((Math.pow(rest_x_coordinates[i] - x_coordinates, 2) +
                    Math.pow(rest_y_coordinates[i] - y_coordinates, 2)), 0.5);
            list.add(distance[i]);
            information.put(distance[i], "Restoran İsmi: " + name_array[i] +
                    "\nAdres: " + address[i] +
                    "\nTelefon: " + telephoneNumber[i] +
                    "\nÇalışma Saatleri: " + workingHours[i] +
                    "\nTanıtım: " + description[i]);
        }

        Collections.sort(list);

        for (int i = 0; i < 5; i++) {
            System.out.println("\n" + information.get(list.get(i)));
        }
    }
}
