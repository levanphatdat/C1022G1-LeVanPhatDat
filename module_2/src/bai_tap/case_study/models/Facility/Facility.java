package bai_tap.case_study.models.Facility;

public abstract class Facility {
    private String serviceName;
    private double usableArea;
    private double rentalCosts;
    private int maximumPeople;
    private int rentalType;

    public Facility() {
    }

    public Facility(String serviceName, double usableArea, double rentalCosts, int maximumPeople, int rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public int getRentalType() {
        return rentalType;
    }

    public void setRentalType(int rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return
                "serviceName = " + serviceName +
                ", usableArea = " + usableArea +
                ", rentalCosts = " + rentalCosts +
                ", maximumPeople = " + maximumPeople +
                ", rentalType = " + rentalType
                ;
    }
}
