package bai_tap.case_study.Services.FacilityService;

import bai_tap.case_study.Models.Facility.Room;
import bai_tap.case_study.Models.Facility.Villa;
import bai_tap.case_study.Repository.Facility.FacilityRepository;
import bai_tap.case_study.Repository.Facility.IFacilityRepository;

public class FacilityService implements IFacilityService {
    IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public void display() {
        iFacilityRepository.display();
    }

    @Override
    public void addRoom(Room room, int num) {
        iFacilityRepository.addRoom(room, num);
    }

    @Override
    public void addVilla(Villa villa, int num) {
        iFacilityRepository.addVilla(villa, num);
    }

    @Override
    public boolean checkServiceCodeRoom(String string) {
        return iFacilityRepository.checkServiceCodeRoom(string);
    }

    @Override
    public boolean checkServiceCodeVilla(String string) {
        return iFacilityRepository.checkServiceCodeVilla(string);
    }

    @Override
    public void displayMaintenance() {
        iFacilityRepository.displayMaintenance();
    }
}
