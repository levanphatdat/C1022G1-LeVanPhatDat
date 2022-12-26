package bai_tap.case_study.models.Facility;

import bai_tap.case_study.models.Facility.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, double usableArea, double rentalCosts, int maximumPeople, int rentalType, String freeService) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room { "+ super.toString() +
                "freeService = " + freeService +
                " } " ;
    }
}
