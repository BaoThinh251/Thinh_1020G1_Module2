package models;

public class Villa extends Services{
    private String roomGrade;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String id, String name, double useArea, String rentType, int maxPerson, String roomGrade, double poolArea, int floor, String otherServices) {
        super(id, name, useArea, rentType, maxPerson, otherServices);
        this.roomGrade = roomGrade;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getRoomGrade() {
        return roomGrade;
    }

    public void setRoomGrade(String roomGrade) {
        this.roomGrade = roomGrade;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String showInfo() {
        return "Villa ID: " + getId() + ", Service name: " + getName() + ", Used Area: " + getUseArea() + " sqM" + ", Max people: " + getMaxPerson()
                + ", Room grade: " + getRoomGrade() + ", Pool area: " + getPoolArea()  + ", Floor: " + getFloor() + ", Rent type (year/month/day/hour): " + getRentType() + "$"
                + ", Addition services: " + getOtherServices();
    }

    @Override
    public String toString() {
        return getId() + "," + getName() + "," + getUseArea() + "," + getMaxPerson() + "," + getRoomGrade()
                + "," + getPoolArea() + "," + getFloor() + "," + getRentType() + "," + getOtherServices();
    }
}
