package bai_tap.case_study.models.Facility;

import bai_tap.case_study.models.Facility.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floors;

    public Villa() {
    }

    public Villa(String serviceName, double usableArea, double rentalCosts, int maximumPeople, int rentalType, String roomStandard, double poolArea, int floors) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
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
                "roomStandard = " + roomStandard +
                ", poolArea = " + poolArea +
                ", floors = " + floors +
                " }" ;
    }
}
