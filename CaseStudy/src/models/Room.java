package models;

public class Room extends Services{

    public Room() {
    }

    public Room(String id, String name, double useArea, String rentType, int maxPerson, String otherServices) {
        super(id, name, useArea, rentType, maxPerson, otherServices);
    }

    @Override
    public String  toString() {
        return getId() + "," + getName() + "," + getUseArea()
                + "," + getMaxPerson() + "," + getRentType() + "," + getOtherServices();
    }

    @Override
    public String showInfo() {
        return "Room ID: " + getId() + ", Service name: " + getName() + ", Used Area: " + getUseArea() + " sqM"
                + ", Max people: " + getMaxPerson() + ", Rent type (year/month/day/hour): " + getRentType() + "$" + ", Addition services: " + getOtherServices();
    }
}
