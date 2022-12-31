package bai_tap.case_study.Data;


import bai_tap.case_study.Models.Facility.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadWriteVilla {
    public static final String VILLA_CSV = "C:\\Users\\Admin\\Desktop\\CG\\module_2\\src\\bai_tap\\case_study\\Data\\villa.csv";

    public Map<Villa, Integer> readVilla() {
        Map<Villa, Integer> VillaIntegerMap = new LinkedHashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(VILLA_CSV));
            String line;
            String[] arr;
            Villa Villa;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                String serviceCode = arr[0];
                String serviceName = arr[1];
                String usableArea = arr[2];
                String rentalCost = arr[3];
                String maxPeople = arr[4];
                String rentalType = arr[5];
                String roomStandard = arr[6];
                String poolArea = arr[7];
                String floors = arr[8];
                Villa = new Villa(serviceCode, serviceName, usableArea, rentalCost, maxPeople, rentalType, roomStandard, poolArea, floors);
                VillaIntegerMap.put(Villa, Integer.parseInt(arr[9]));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return VillaIntegerMap;
    }

    public void writeVilla(Map<Villa, Integer> VillaIntegerMap) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(VILLA_CSV));
            for (Map.Entry<Villa, Integer> VillaIntegerEntry : VillaIntegerMap.entrySet()) {
                bufferedWriter.write(VillaIntegerEntry.getKey().getServiceCode() + "," + VillaIntegerEntry.getKey().getServiceName() + "," +
                        VillaIntegerEntry.getKey().getUsableArea() + "," + VillaIntegerEntry.getKey().getRentalCosts() + "," +
                        VillaIntegerEntry.getKey().getMaximumPeople() + "," + VillaIntegerEntry.getKey().getRentalType() + "," +
                        VillaIntegerEntry.getKey().getRoomStandard() + "," + VillaIntegerEntry.getKey().getPoolArea() + "," +
                        VillaIntegerEntry.getKey().getFloors() + "," + VillaIntegerEntry.getValue() + "\n");

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
