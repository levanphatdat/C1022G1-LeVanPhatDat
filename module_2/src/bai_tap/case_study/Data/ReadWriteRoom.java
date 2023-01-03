package bai_tap.case_study.Data;

import bai_tap.case_study.Models.Facility.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriteRoom {

    public static final String ROOM_CSV = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\bai_tap\\case_study\\Data\\room.csv";

    public Map<Room, Integer> readRoom() {
        Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(ROOM_CSV));
            String line;
            String[] arr;
            Room room;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                String serviceCode = arr[0];
                String serviceName = arr[1];
                String usableArea = arr[2];
                String rentalCost = arr[3];
                String maxPeople = arr[4];
                String rentalType = arr[5];
                String freeService = arr[6];
                room = new Room(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType, freeService);
                roomIntegerMap.put(room, Integer.parseInt(arr[7]));
            }

        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return roomIntegerMap;
    }

    public void writeRoom(Map<Room, Integer> roomIntegerMap) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(ROOM_CSV));
            for (Map.Entry<Room, Integer> roomIntegerEntry : roomIntegerMap.entrySet()) {
                bufferedWriter.write(roomIntegerEntry.getKey().getServiceCode() + "," + roomIntegerEntry.getKey().getServiceName() + "," +
                        roomIntegerEntry.getKey().getUsableArea() + "," + roomIntegerEntry.getKey().getRentalCosts() + "," +
                        roomIntegerEntry.getKey().getMaximumPeople() + "," + roomIntegerEntry.getKey().getRentalType() + "," +
                        roomIntegerEntry.getKey().getFreeService() + "," + roomIntegerEntry.getValue() + "\n");

            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
