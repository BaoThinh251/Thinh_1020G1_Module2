package models;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    private String name, birth, id, gender, email, customerType, address, phoneNumber, buyTickets, services;

    public Customer() {
    }

    public Customer(String name, String birth, String id, String gender, String email, String customerType, String address,  String phoneNumber, String buyTickets) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.buyTickets = buyTickets;
    }

    public Customer(String name, String birth, String id, String gender, String email, String customerType, String address,  String phoneNumber, String buyTickets, String services) {
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.buyTickets = buyTickets;
        this.services = services;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getBuyTickets() {
        return buyTickets;
    }

    public void setBuyTickets(String buyTickets) {
        this.buyTickets = buyTickets;
    }

    @Override
    public String toString() {
        return getName() + "," + getBirth() + "," + getId() + "," + getGender() + "," + getEmail()
                + "," + getCustomerType() + "," + getAddress() + "," + getPhoneNumber() + "," + getBuyTickets() + "," + getServices();
    }

    public String showInfoWithoutService() {
        return "Name: " + getName() + ", Date of birth: " + getBirth() + ", Gender (Male/Female/Others): " +
        getGender() + ", ID: " + getId() + ", Email: " + getEmail() + ", Customer Type: " + getCustomerType()
        + ", Address: " + getAddress() + ", phone number: " + getPhoneNumber() + ", have buy tickets: " + getBuyTickets();
    }

    public String showInfoWithService() {
        return "Name: " + getName() + ", Date of birth: " + getBirth() + ", Gender (Male/Female/Others): " +
                getGender() + ", ID: " + getId() + ", Email: " + getEmail() + ", Customer Type: " + getCustomerType()
                + ", Address: " + getAddress() + ", have buy tickets: " + getBuyTickets() + ", Services: " + getServices();
    }


    @Override
    public int compareTo(Customer o) {
        if (this.getName().compareTo(o.getName()) == 0) {
            return this.getBirth().compareTo(o.getBirth());
        } else {
            return this.getName().compareTo(o.getName());
        }
    }
}
