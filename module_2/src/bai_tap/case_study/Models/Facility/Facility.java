package bai_tap.case_study.Models.Facility;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private String usableArea;
    private String rentalCosts;
    private String maximumPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, String usableArea, String rentalCosts, String maximumPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(String maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return  "serviceCode = "+ serviceCode+
                "serviceName = " + serviceName +
                ", usableArea = " + usableArea +
                ", rentalCosts = " + rentalCosts +
                ", maximumPeople = " + maximumPeople +
                ", rentalType = " + rentalType
                ;
    }
}
