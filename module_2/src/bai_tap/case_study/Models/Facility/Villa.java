package bai_tap.case_study.Models.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private int floors;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, String usableArea, String rentalCosts, int maximumPeople, String rentalType, String roomStandard, String poolArea, int floors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa { " + super.toString()+
                ", roomStandard = " + roomStandard +
                ", poolArea = " + poolArea +
                ", floors = " + floors +
                " }" ;
    }

}
