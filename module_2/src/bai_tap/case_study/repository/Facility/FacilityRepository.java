package bai_tap.case_study.repository.Facility;

import bai_tap.case_study.models.Facility.Room;
import bai_tap.case_study.models.Facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository{
    public static Map<Room,Integer> roomMap=new LinkedHashMap<>();
    public static Map<Villa,Integer> villaMap=new LinkedHashMap<>();
    static {
        roomMap.put(new Room("SVRO-0001","Room 1","100m2","1000000",3,"3 months","Breakfast"),1);
        roomMap.put(new Room("SVRO-0002","Room 2","120m2","1100000",4,"6 days","Breakfast"),2);
        roomMap.put(new Room("SVRO-0003","Room 3","100m2","1000000",3,"1 month","Breakfast"),3);

        villaMap.put(new Villa("SVVL-0001","Villa 1","200m2","4500000",4,"1 month","4 start","120m2",3),2);
        villaMap.put(new Villa("SVVL-0002","Villa 2","200m2","4500000",4,"1 month","4 start","120m2",3),2);
        villaMap.put(new Villa("SVVL-0003","Villa 3","300m2","6000000",6,"5 days","4.5 start","150m2",3),3);
    }

    @Override
    public void display() {
        for (Map.Entry<Room,Integer> room : roomMap.entrySet()){
            System.out.println(room);
        }
        System.out.println();
        for (Map.Entry<Villa,Integer> villa : villaMap.entrySet()){
            System.out.println(villa);
        }
    }
}
