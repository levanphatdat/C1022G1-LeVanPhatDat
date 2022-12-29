package bai_tap.case_study.Services.FacilityService;

import bai_tap.case_study.Models.Facility.Room;
import bai_tap.case_study.Models.Facility.Villa;

public interface IFacilityService {
    void display();

    void addRoom(Room room, int num);

    void addVilla(Villa villa, int num);

    boolean checkServiceCodeRoom(String string);

    boolean checkServiceCodeVilla(String string);

    void displayMaintenance();
}
