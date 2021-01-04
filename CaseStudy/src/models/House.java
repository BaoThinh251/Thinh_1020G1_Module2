package models;

public class House extends Services{
    private String roomGrade;
    private int floor;

    public House() {
    }

    public House(String id, String name, double useArea, String rentType, int maxPerson, String roomGrade, int floor, String otherServices) {
        super(id, name, useArea, rentType, maxPerson, otherServices);
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
    public String toString() {
        return getId() + "," + getName() + "," + getUseArea() + "," + getMaxPerson()
                + "," + getRoomGrade() + "," + getFloor() + "," + getRentType() + "," + getOtherServices();
    }

    @Override
    public String showInfo() {
        return "House ID: " + getId() + ", Service name: " + getName() + ", Used Area: " + getUseArea() + " sqM" + ", Max people: " + getMaxPerson()
                + ", Room grade: " + getRoomGrade() + ", Floor: " + getFloor() + ", Rent type (year/month/day/hour): " + getRentType() + "$" + ", Addition services: " + getOtherServices();
    }
}
