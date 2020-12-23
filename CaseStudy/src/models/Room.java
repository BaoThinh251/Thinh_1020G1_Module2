package models;

public class Room extends Services{

    public Room() {
    }

    public Room(String id, String name, double useArea, double cost, int maxPerson) {
        super(id, name, useArea, cost, maxPerson);
    }

    @Override
    public void showInfo() {
        System.out.println("Villa ID: " + getId() + "\nService name: " + getName() + "\nUsed Area: " + getUseArea() + " sqM"
                + "\nMax people: " + getMaxPerson() + "\nCost per day: " + getCost() + "$");
    }
}
