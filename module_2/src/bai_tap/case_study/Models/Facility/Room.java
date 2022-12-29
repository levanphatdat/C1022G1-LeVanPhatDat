package bai_tap.case_study.Models.Facility;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, String usableArea, String rentalCosts, int maximumPeople, String rentalType, String freeService) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
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
                ", freeService = " + freeService +
                " } " ;
    }
}
