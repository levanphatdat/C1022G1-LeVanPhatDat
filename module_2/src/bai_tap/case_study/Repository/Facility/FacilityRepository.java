package bai_tap.case_study.Repository.Facility;

import bai_tap.case_study.Models.Facility.Room;
import bai_tap.case_study.Models.Facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    public static Map<Room, Integer> roomMap = new LinkedHashMap<>();
    public static Map<Villa, Integer> villaMap = new LinkedHashMap<>();

    static {
        roomMap.put(new Room("SVRO-0001", "Room 1", "100m2", "1000000", 3, "3 months", "Breakfast"), 1);
        roomMap.put(new Room("SVRO-0002", "Room 2", "120m2", "1100000", 4, "6 days", "Breakfast"), 5);
        roomMap.put(new Room("SVRO-0003", "Room 3", "100m2", "1000000", 3, "1 month", "Breakfast"), 3);

        villaMap.put(new Villa("SVVL-0001", "Villa 1", "200m2", "4500000", 4, "1 month", "4 start", "120m2", 3), 2);
        villaMap.put(new Villa("SVVL-0002", "Villa 2", "200m2", "4500000", 4, "1 month", "4 start", "120m2", 3), 2);
        villaMap.put(new Villa("SVVL-0003", "Villa 3", "300m2", "6000000", 6, "5 days", "4.5 start", "150m2", 3), 6);
    }

    @Override
    public void display() {
        for (Map.Entry<Room, Integer> room : roomMap.entrySet()) {
            System.out.println(room.getKey());
            System.out.println("Number of times used is " + room.getValue());
        }
        System.out.println();
        for (Map.Entry<Villa, Integer> villa : villaMap.entrySet()) {
            System.out.println(villa.getKey());
            System.out.println("Number of times used is " + villa.getValue());
        }
    }

    @Override
    public void addRoom(Room room, int num) {
        roomMap.put(room, num);
    }

    @Override
    public void addVilla(Villa villa, int num) {
        villaMap.put(villa, num);
    }

    @Override
    public boolean checkServiceCodeRoom(String string) {
        for (Room room : roomMap.keySet()) {
            if (room.getServiceCode().equals(string)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkServiceCodeVilla(String string) {
        for (Villa villa : villaMap.keySet()) {
            if (villa.getServiceCode().equals(string)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void displayMaintenance() {
        for (Map.Entry<Room, Integer> roomIntegerEntry : roomMap.entrySet()) {
            if (roomIntegerEntry.getValue() > 4) {
                System.out.println(roomIntegerEntry.getKey());
                System.out.println("Number of times used is " + roomIntegerEntry.getValue());
            }
        }
        for (Map.Entry<Villa, Integer> villaIntegerEntry : villaMap.entrySet()) {
            if ((villaIntegerEntry.getValue() > 4)) {
                System.out.println(villaIntegerEntry.getKey());
                System.out.println("Number of times used is " + villaIntegerEntry.getValue());
            }
        }
    }


}
