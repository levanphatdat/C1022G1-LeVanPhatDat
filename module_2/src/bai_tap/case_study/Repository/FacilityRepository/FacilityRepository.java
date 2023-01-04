package bai_tap.case_study.Repository.FacilityRepository;

import bai_tap.case_study.Data.ReadWriteRoom;
import bai_tap.case_study.Data.ReadWriteVilla;
import bai_tap.case_study.Models.Facility.Room;
import bai_tap.case_study.Models.Facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    public static Map<Room, Integer> roomMap = new LinkedHashMap<>();
    public static Map<Villa, Integer> villaMap = new LinkedHashMap<>();
    ReadWriteRoom readWriteRoom = new ReadWriteRoom();
    ReadWriteVilla readWriteVilla = new ReadWriteVilla();

    @Override
    public void display() {
        roomMap = readWriteRoom.readRoom();
        for (Map.Entry<Room, Integer> room : roomMap.entrySet()) {
            System.out.println(room.getKey());
            System.out.println("Number of times used is " + room.getValue());
        }
        System.out.println();
        villaMap = readWriteVilla.readVilla();
        for (Map.Entry<Villa, Integer> villa : villaMap.entrySet()) {
            System.out.println(villa.getKey());
            System.out.println("Number of times used is " + villa.getValue());
        }
    }

    @Override
    public void addRoom(Room room, int num) {
        roomMap.put(room, num);
        readWriteRoom.writeRoom(roomMap);
        roomMap.clear();
    }

    @Override
    public void addVilla(Villa villa, int num) {
        villaMap.put(villa, num);
        readWriteVilla.writeVilla(villaMap);
        villaMap.clear();
    }

    @Override
    public boolean checkServiceCodeRoom(String string) {
        roomMap = readWriteRoom.readRoom();
        for (Room room : roomMap.keySet()) {
            if (room.getServiceCode().equals(string)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkServiceCodeVilla(String string) {
        villaMap = readWriteVilla.readVilla();
        for (Villa villa : villaMap.keySet()) {
            if (villa.getServiceCode().equals(string)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void displayMaintenance() {
        roomMap = readWriteRoom.readRoom();
        for (Map.Entry<Room, Integer> roomIntegerEntry : roomMap.entrySet()) {
            if (roomIntegerEntry.getValue() >= 5) {
                System.out.println(roomIntegerEntry.getKey());
                System.out.println("Number of times used is " + roomIntegerEntry.getValue());
            }
        }
        villaMap = readWriteVilla.readVilla();
        for (Map.Entry<Villa, Integer> villaIntegerEntry : villaMap.entrySet()) {
            if ((villaIntegerEntry.getValue() >= 5)) {
                System.out.println(villaIntegerEntry.getKey());
                System.out.println("Number of times used is " + villaIntegerEntry.getValue());
            }
        }
    }


}
