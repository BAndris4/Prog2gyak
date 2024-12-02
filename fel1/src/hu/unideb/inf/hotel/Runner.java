package hu.unideb.inf.hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {
    public static ArrayList<Hotel> findAvailableHotels(HashMap<String, Hotel> hM) {
        ArrayList<Hotel> hotels = new ArrayList<>();
        for (String key : hM.keySet()) {
            if (hM.get(key).isRoomAvailable()) {
                hotels.add(hM.get(key));
            }
        }
        return hotels;
    }
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File(args[0]));
        HashMap<String, Hotel> hotelHashMap = new HashMap<>();
        while (sc.hasNext()) {
            String[] line = sc.nextLine().split(";");
            hotelHashMap.put(line[0], new Hotel(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), Integer.parseInt(line[3])));
        }
        for (String key : hotelHashMap.keySet()) {
            System.out.println(key + ": " + hotelHashMap.get(key));
        }

        ArrayList<Hotel> availableHotels = findAvailableHotels(hotelHashMap);
        availableHotels.stream().sorted(new Comparator<Hotel>() {
            @Override
            public int compare(Hotel o1, Hotel o2) {
                int v = o1.getRooms()-o2.getRooms();
                if (v!=0) return v;
                return o1.getHotelName().compareTo(o2.getHotelName());
            }
        }).forEach(System.out::println);

    }
}
