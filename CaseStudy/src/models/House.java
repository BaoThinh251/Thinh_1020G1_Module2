package models;

public class House extends Services{
    private String roomGrade;
    private int floor;

    public House() {
    }

    public House(String id, String name, double useArea, double cost, int maxPerson, String roomGrade, int floor) {
        super(id, name, useArea, cost, maxPerson);
        this.roomGrade = roomGrade;
        this.floor = floor;
    }

    public String getRoomGrade() {
        return roomGrade;
    }

    public void setRoomGrade(String roomGrade) {
        this.roomGrade = roomGrade;
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
                + "\nRoom grade: " + getRoomGrade() + "\nFloor: " + getFloor() + "\nCost per day: " + getCost() + "$");
    }
}
