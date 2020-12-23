package models;

public abstract class Services {
    private String id, name;
    private double useArea, cost;
    private int maxPerson;

    public Services() {
    }

    public Services(String id, String name, double useArea, double cost, int maxPerson) {
        this.id = id;
        this.name = name;
        this.useArea = useArea;
        this.cost = cost;
        this.maxPerson = maxPerson;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public abstract void showInfo();
}
