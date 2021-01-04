package models;

public abstract class Services {
    private String id, name, otherServices, rentType;
    private double useArea;
    private int maxPerson;

    public Services() {
    }

    public Services(String id, String name, double useArea, String  rentType, int maxPerson, String otherServices) {
        this.id = id;
        this.name = name;
        this.useArea = useArea;
        this.rentType = rentType;
        this.maxPerson = maxPerson;
        this.otherServices = otherServices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getOtherServices() {
        return otherServices;
    }

    public void setOtherServices(String otherServices) {
        this.otherServices = otherServices;
    }

    public abstract String showInfo();
}
