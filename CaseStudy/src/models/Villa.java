package models;

public class Villa extends Services{
    private String roomGrade;
    private double poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String id, String name, double useArea, double cost, int maxPerson, String roomGrade, double poolArea, int floor) {
        super(id, name, useArea, cost, maxPerson);
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
    public void showInfo() {
        System.out.println("Villa ID: " + getId() + "\nService name: " + getName() + "\nUsed Area: " + getUseArea() + " sqM" + "\nMax people: " + getMaxPerson()
        + "\nRoom grade: " + getRoomGrade() + "\nPool area: " + getPoolArea() + " sqM" + "\nFloor: " + getFloor() + "\nCost per day: " + getCost() + "$");
    }
}
