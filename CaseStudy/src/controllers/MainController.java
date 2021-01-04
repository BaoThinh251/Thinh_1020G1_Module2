package controllers;

import models.*;
import java.io.*;
import java.util.*;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class MainController {
    static Scanner input = new Scanner(System.in);

    public static void displayMainMenu() {
        int choice;
        do {
            System.out.println("1.Add new services" + "\n2.Show services" + "\n3.Add new customer"
                    + "\n4.Show customer information" + "\n5.Add new booking" + "\n6.Show employee information"
                    + "\n7.Buy ticket for 4D cinema" + "\n8.Find employee" + "\n9.Exit");
                choice = input.nextInt();
            switch(choice) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showCustomerInformation();
                    break;
                case 5:
                    addBooking();
                    break;
                case 6:
                    showEmployees();
                    break;
                case 7:
                    buyTickets();
                    break;
                case 8:
                    findEmployees();
                    break;
                case 9:
                    System.out.println("EXIT!");
                    System.exit(0);
                default:
                    System.out.println("Wrong input please try again!");
            }
        } while (true);
    }

    public static void addNewServices(){
        int choice;
        int regexCondition;
        String nameRegex = "[A-Z][a-z0-9]+", idVillaRegex = "(SVVL)-[0-9]{4}", roomGradeRegex = "[A-Z][a-z0-9]+", idHouseRegex = "(SVHO)-[0-9]{4}", idRoomRegex = "(SVRO)-[0-9]{4}",
                otherServicesRegex = "-?(Massage)?-?(Karaoke)?-?(Food)?-?(Drink)?-?(Car for rent)?-?(None)?-?", rentTypeRegex = "(Years)?(Months)?(Days)?(Hours)?";
        double areaUsedRegex = 30, poolUsedRegex = 30;
        int maxPersonRegex = 20, floorRegex = 0;

            do {
                System.out.println("1.Add new Villa" + "\n2.Add new House" + "\n3.Add new Room"
                        + "\n4.Back to menu");
                choice = input.nextInt();
                    switch (choice) {
                    case 1:
                        String nameVilla, idVilla, gradeVilla, otherServicesVilla, rentTypeVilla;
                        double areaVilla, poolAreaVilla;
                        int personVilla, floorVilla;
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong name input!");
                            }
                            System.out.println("Input name: ");
                            nameVilla = input.next();
                            regexCondition++;
                        } while (!nameVilla.matches(nameRegex));
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong ID input!");
                            }
                            System.out.println("Input ID: ");
                            idVilla = input.next();
                            regexCondition++;
                        } while (!idVilla.matches(idVillaRegex));
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Used area too small!");
                            }
                            System.out.println("Input used area: ");
                            areaVilla = input.nextDouble();
                            regexCondition++;
                        } while (areaVilla < areaUsedRegex);
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Max person need to be between 1-20!");
                            }
                            System.out.println("Input max person: ");
                            personVilla = input.nextInt();
                            regexCondition++;
                        } while (personVilla < 0 || personVilla > maxPersonRegex);
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong room grade input!");
                            }
                            System.out.println("Input Room grade: ");
                            gradeVilla = input.next();
                            regexCondition++;
                        } while (!gradeVilla.matches(roomGradeRegex));
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Pool area too small!");
                            }
                            System.out.println("Input pool area: ");
                            poolAreaVilla = input.nextDouble();
                            regexCondition++;
                        } while (poolAreaVilla < poolUsedRegex);
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Floor must be larger than 1!");
                            }
                            System.out.println("Input number of floor: ");
                            floorVilla = input.nextInt();
                            regexCondition++;
                        } while (floorVilla <= floorRegex);
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong services input!");
                            }
                            System.out.println("Input services name: ");
                            otherServicesVilla = input.next();
                            regexCondition++;
                        } while (!otherServicesVilla.matches(otherServicesRegex));
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong rent type input!");
                            }
                            System.out.println("Input rent type name : ");
                            rentTypeVilla = input.next();
                            regexCondition++;
                        } while (!rentTypeVilla.matches(rentTypeRegex));
                        Villa villa = new Villa(idVilla, nameVilla, areaVilla, rentTypeVilla, personVilla, gradeVilla, poolAreaVilla, floorVilla, otherServicesVilla);
                        try {
                            String villaOutput = villa.toString();
                            BufferedWriter villaInput = new BufferedWriter(new FileWriter("src/data/Villa.csv", true));
                            villaInput.write(villaOutput);
                            villaInput.newLine();
                            villaInput.close();
                        } catch (IOException e) {
                            System.out.println("Can't write this File!");
                        }
                        break;
                    case 2:
                        String nameHouse, idHouse, gradeHouse, otherServicesHouse, rentTypeHouse;
                        double areaHouse;
                        int personHouse, floorHouse;
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong name input!");
                            }
                            System.out.println("Input name: ");
                            nameHouse = input.next();
                            regexCondition++;
                        } while (!nameHouse.matches(nameRegex));
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong ID input!");
                            }
                            System.out.println("Input ID: ");
                            idHouse = input.next();
                            regexCondition++;
                        } while (!idHouse.matches(idHouseRegex));
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Used area too small!");
                            }
                            System.out.println("Input used area: ");
                            areaHouse = input.nextDouble();
                            regexCondition++;
                        } while (areaHouse < areaUsedRegex);
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Max person need to be between 1-20!");
                            }
                            System.out.println("Input max person: ");
                            personHouse = input.nextInt();
                            regexCondition++;
                        } while (personHouse < 0 || personHouse > maxPersonRegex);
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong room grade input!");
                            }
                            System.out.println("Input Room grade: ");
                            gradeHouse = input.next();
                            regexCondition++;
                        } while (!gradeHouse.matches(roomGradeRegex));
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Floor must be lagger than 1!");
                            }
                            System.out.println("Input number of floor: ");
                            floorHouse = input.nextInt();
                            regexCondition++;
                        } while (floorHouse <= floorRegex);
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong services input!");
                            }
                            System.out.println("Input services name: ");
                            otherServicesHouse = input.next();
                            regexCondition++;
                        } while (!otherServicesHouse.matches(otherServicesRegex));
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong rent type input!");
                            }
                            System.out.println("Input rent type name: ");
                            rentTypeHouse = input.next();
                            regexCondition++;
                        } while (!rentTypeHouse.matches(rentTypeRegex));
                        House house = new House(idHouse, nameHouse, areaHouse, rentTypeHouse, personHouse, gradeHouse, floorHouse, otherServicesHouse);
                        try {
                            String houseOutput = house.toString();
                            BufferedWriter houseInput = new BufferedWriter(new FileWriter("src/data/House.csv", true));
                            houseInput.write(houseOutput);
                            houseInput.newLine();
                            houseInput.close();
                        } catch (IOException e) {
                            System.out.println("Can't write this File!");
                        }
                        break;
                    case 3:
                        String nameRoom, idRoom, otherServicesRoom, rentTypeRoom;
                        double areaRoom;
                        int personRoom;
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong name input!");
                            }
                            System.out.println("Input name: ");
                            nameRoom = input.next();
                            regexCondition++;
                        } while (!nameRoom.matches(nameRegex));
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong ID input!");
                            }
                            System.out.println("Input ID: ");
                            idRoom = input.next();
                            regexCondition++;
                        } while (!idRoom.matches(idRoomRegex));
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Used area too small!");
                            }
                            System.out.println("Input used area: ");
                            areaRoom = input.nextDouble();
                            regexCondition++;
                        } while (areaRoom < areaUsedRegex);
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Max person need to be between 1-20!");
                            }
                            System.out.println("Input max person: ");
                            personRoom = input.nextInt();
                            regexCondition++;
                        } while (personRoom < 0 || personRoom > maxPersonRegex);
                        regexCondition = 0;
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong services input!");
                            }
                            System.out.println("Input services name: ");
                            otherServicesRoom = input.next();
                            regexCondition++;
                        } while (!otherServicesRoom.matches(otherServicesRegex));
                        do {
                            if (regexCondition > 0) {
                                System.out.println("Wrong rent type input!");
                            }
                            System.out.println("Input rent type name: ");
                            rentTypeRoom = input.next();
                            regexCondition++;
                        } while (!rentTypeRoom.matches(rentTypeRegex));
                        Room room = new Room(idRoom, nameRoom, areaRoom, rentTypeRoom, personRoom, otherServicesRoom);
                        try {
                            String roomOutput = room.toString();
                            BufferedWriter roomInput = new BufferedWriter(new FileWriter("src/data/Room.csv", true));
                            roomInput.write(roomOutput);
                            roomInput.newLine();
                            roomInput.close();
                        } catch (IOException e) {
                            System.out.println("Can't write this File!");
                        }
                }
            } while (choice > 0 && choice <= 3);
            if (choice != 4) {
                System.out.println("Wrong input! Please try again!");
            }


    }

    public static void showServices(){
        int choice;
        File villaFile = new File("src/data/Villa.csv");
        File houseFile = new File("src/data/House.csv");
        File roomFile = new File("src/data/Room.csv");
        do {
            System.out.println("1.Show all Villa" + "\n2.Show all House" + "\n3.Show all Room"
                    + "\n4.Show all Villa name not duplicate" + "\n5.Show all House name not duplicate"
                    + "\n6.Show all Room name not duplicate" + "\n7.Back to Menu");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    ArrayList<Villa> villaList = new ArrayList<>();
                    try {
                        BufferedReader villaInput = new BufferedReader(new FileReader(villaFile));
                        String line;
                        if (villaFile.length() > 0) {
                            while ((line = villaInput.readLine()) != null) {
                                String[] elementsVilla = line.split(",");
                                String villaID = elementsVilla[0];
                                String name = elementsVilla[1];
                                double useArea = parseDouble(elementsVilla[2]);
                                int maxPerson = parseInt(elementsVilla[3]);
                                String roomGrade = elementsVilla[4];
                                double poolArea = parseDouble(elementsVilla[5]);
                                int floor = parseInt(elementsVilla[6]);
                                String rentType = elementsVilla[7];
                                String otherServices = elementsVilla[8];
                                Villa villa = new Villa(villaID, name, useArea, rentType,
                                        maxPerson, roomGrade, poolArea, floor, otherServices);
                                villaList.add(villa);
                            }
                            for (Villa villaObj : villaList) {
                                System.out.println(villaObj.showInfo());
                            }
                        } else {
                            System.out.println("Villa list is empty!");
                        }
                    } catch (IOException e) {
                        System.out.println("Can't read this file!");
                    }
                    break;
                case 2:
                    ArrayList<House> houseList = new ArrayList<>();
                    try {
                        BufferedReader houseInput = new BufferedReader(new FileReader(houseFile));
                        String line;
                        if (houseFile.length() > 0) {
                            while ((line = houseInput.readLine()) != null) {
                                String[] elementsHouse = line.split(",");
                                String houseID = elementsHouse[0];
                                String name = elementsHouse[1];
                                double useArea = parseDouble(elementsHouse[2]);
                                int maxPerson = parseInt(elementsHouse[3]);
                                String roomGrade = elementsHouse[4];
                                int floor = parseInt(elementsHouse[5]);
                                String  rentType = elementsHouse[6];
                                String otherServices = elementsHouse[7];
                                House house = new House(houseID, name, useArea, rentType,
                                        maxPerson, roomGrade, floor, otherServices);
                                houseList.add(house);
                            }
                            for (House houseObj : houseList) {
                                System.out.println(houseObj.showInfo());
                            }
                        } else {
                            System.out.println("House list is empty!");
                        }
                    } catch (IOException e) {
                        System.out.println("Can't read this file!");
                    }
                    break;
                case 3:
                    ArrayList<Room> roomList = new ArrayList<>();
                    try {
                        BufferedReader roomInput = new BufferedReader(new FileReader(roomFile));
                        String line;
                        if (roomFile.length() > 0) {
                            while ((line = roomInput.readLine()) != null) {
                                String[] elementsRoom = line.split(",");
                                String houseID = elementsRoom[0];
                                String name = elementsRoom[1];
                                double useArea = parseDouble(elementsRoom[2]);
                                int maxPerson = parseInt(elementsRoom[3]);
                                String rentType = elementsRoom[4];
                                String otherServices = elementsRoom[5];
                                Room room = new Room(houseID, name, useArea, rentType,
                                        maxPerson, otherServices);
                                roomList.add(room);
                            }
                            for (Room roomObj : roomList) {
                                System.out.println(roomObj.showInfo());
                            }
                        } else {
                            System.out.println("Room list is empty!");
                        }
                    } catch (IOException e) {
                        System.out.println("Can't read this file!");
                    }
                    break;
                case 4:
                    TreeSet<String> villaNameSet = new TreeSet<>();
                    try {
                        BufferedReader villaInput = new BufferedReader(new FileReader(villaFile));
                        String line;
                        if (villaFile.length() > 0) {
                            while ((line = villaInput.readLine()) != null) {
                                String[] elementsVilla = line.split(",");
                                String name = elementsVilla[1];
                                villaNameSet.add(name);
                            }
                            for (String element : villaNameSet) {
                                System.out.println(element);
                            }
                        } else {
                            System.out.println("Villa list is empty!");
                        }
                    } catch (IOException e) {
                        System.out.println("Can't read this file!");
                    }
                    break;
                case 5:
                    TreeSet<String> houseNameSet = new TreeSet<>();
                    try {
                        BufferedReader houseInput = new BufferedReader(new FileReader(houseFile));
                        String line;
                        if (houseFile.length() > 0) {
                            while ((line = houseInput.readLine()) != null) {
                                String[] elementsHouse = line.split(",");
                                String name = elementsHouse[1];
                                houseNameSet.add(name);
                            }
                            for (String element : houseNameSet) {
                                System.out.println(element);
                            }
                        } else {
                            System.out.println("House list is empty!");
                        }
                    } catch (IOException e) {
                        System.out.println("Can't read this file!");
                    }
                    break;
                case 6:
                    TreeSet<String> roomNameSet = new TreeSet<>();
                    try {
                        BufferedReader roomInput = new BufferedReader(new FileReader(roomFile));
                        String line;
                        if (roomFile.length() > 0) {
                            while ((line = roomInput.readLine()) != null) {
                                String[] elementsRoom = line.split(",");
                                String name = elementsRoom[1];
                                roomNameSet.add(name);
                            }
                            for (String element : roomNameSet) {
                                System.out.println(element);
                            }
                        } else {
                            System.out.println("Room list is empty!");
                        }
                    } catch (IOException e) {
                        System.out.println("Can't read this file!");
                    }
                    break;
            }
        } while (choice > 0 && choice <= 6);
        if (choice != 7) {
            System.out.println("Wrong input! Please try again!");
        }
    }

    public static void addNewCustomer() {
        int regexCondition;
        String nameCusRegex = "[A-Z][a-z]+";
        String birthRegex = "(((0[1-9]|[12][0-9]|30)[-/](0[1-9]|1[012])|31[-/](0[13578]|1[012])|(0[1-9]|1[0-9]|2[0-8])[-/]02)+[-/](19[0-9]{2}|200[012])|29[-/]02[-/]\"+\"([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))";
        String genderRegex = "(Male)?(Female)?(Others)?";
        String emailRegex = "[\\w]+@[A-Za-z]+.[A-Za-z]+";
        String idRegex = "[0-9]{3}-[0-9]{3}-[0-9]{3}";
        String phoneRegex = "(0|\\+84)\\d{9}";
        String customerTypeRegex = "(Diamond)?(Platinum)?(Gold)?(Silver)?(Member)?";
        String ticketRegex = "(Yes)?(No)?";
        String name, birth, gender, email, id, customerType, address, phoneNumber, buyTickets, temp, temp1;

        regexCondition = 0;
        do {
            if (regexCondition > 0) {
                System.out.println("Wrong name input!");
            }
            System.out.println("Input name: ");
            name = input.next();
            regexCondition++;
        } while (!name.matches(nameCusRegex));
        input.nextLine();

        regexCondition = 0;
        do {
            if (regexCondition > 0) {
                System.out.println("Date of birth must be dd/mm/yyyy and real age!");
            }
            System.out.println("Input birth: ");
            birth = input.next();
            regexCondition++;
        } while (!birth.matches(birthRegex));

        regexCondition = 0;
        do {
            if (regexCondition > 0) {
                System.out.println("Wrong ID input!");
            }
            System.out.println("Input ID: ");
            id = input.next();
            regexCondition++;
        } while (!id.matches(idRegex));

        regexCondition = 0;
        do {
            if (regexCondition > 0) {
                System.out.println("Wrong gender input!");
            }
            System.out.println("Input Gender: ");
            gender = input.next();
            temp = gender.substring(0, 1).toUpperCase();
            temp1 = gender.substring(1).toLowerCase();
            gender = temp + temp1;
            regexCondition++;
        } while (!gender.matches(genderRegex));

        regexCondition = 0;
        do {
            if (regexCondition > 0) {
                System.out.println("Wrong email input!");
            }
            System.out.println("Input email: ");
            email = input.next();
            regexCondition++;
        } while (!email.matches(emailRegex));

        regexCondition = 0;
        do {
            if (regexCondition > 0) {
                System.out.println("Wrong customer Type input!");
            }
            System.out.println("Input Customer type: ");
            customerType = input.next();
            temp = customerType.substring(0, 1).toUpperCase();
            temp1 = customerType.substring(1).toLowerCase();
            customerType = temp + temp1;
            regexCondition++;
        } while (!customerType.matches(customerTypeRegex));
        System.out.println("Input address: ");
        address = input.next();
        input.nextLine();
        regexCondition = 0;
        do {
            if (regexCondition > 0) {
                System.out.println("Wrong phone number input");
            }
            System.out.println("Input phone number: ");
            phoneNumber = input.next();
            regexCondition++;
        } while (!phoneNumber.matches(phoneRegex));
        regexCondition = 0;
        do {
            if (regexCondition > 0) {
                System.out.println("Wrong input");
            }
            System.out.println("Buy tickets (yes/no): ");
            buyTickets = input.next();
            temp = buyTickets.substring(0, 1).toUpperCase();
            temp1 = buyTickets.substring(1).toLowerCase();
            buyTickets = temp + temp1;
            regexCondition++;
        } while (!buyTickets.matches(ticketRegex));
        Customer addCustomer = new Customer(name, birth, id, gender, email, customerType, address, phoneNumber, buyTickets);
        try {
            String customerAdd = addCustomer.toString();
            BufferedWriter houseInput = new BufferedWriter(new FileWriter("src/data/Customer.csv", true));
            houseInput.write(customerAdd);
            houseInput.newLine();
            houseInput.close();
        } catch (IOException e) {
            System.out.println("Can't write this File!");
        }
    }

    public static void showCustomerInformation() {
        ArrayList<Customer> customerList = new ArrayList<>();
        File customerFile = new File("src/data/Customer.csv");
        try {
            BufferedReader customerOutput = new BufferedReader(new FileReader(customerFile));
            String line;
            if (customerFile.length() > 0) {
                while ((line = customerOutput.readLine()) != null) {
                    String[] customerElements = line.split(",");
                    String name = customerElements[0];
                    String birth = customerElements[1];
                    String id = customerElements[2];
                    String gender = customerElements[3];
                    String email = customerElements[4];
                    String customerType = customerElements[5];
                    String address = customerElements[6];
                    String phoneNumber = customerElements[7];
                    String buyTickets = customerElements[8];
                    Customer customer = new Customer(name, birth, id, gender, email, customerType, address, phoneNumber, buyTickets);
                    customerList.add(customer);
                }
                Collections.sort(customerList);
                for (Customer customerObj : customerList) {
                    System.out.println(customerObj.showInfoWithoutService());
                }
            } else {
                System.out.println("Customer list is empty!");
            }
        } catch (IOException e) {
            System.out.println("Can't read this file!");
        }
    }

    public static void showEmployees() {
        TreeMap<String, Employee> employeeMap = new TreeMap<>();
        File employeeFile = new File("src/data/Employee.csv");
        try {
            BufferedReader employeeOutput = new BufferedReader(new FileReader(employeeFile));
            String line;
            while ((line = employeeOutput.readLine()) != null) {
                String[] employeeArray = line.split(",");
                Employee employee = new Employee(employeeArray[1], Integer.parseInt(employeeArray[2]), employeeArray[3]);
                employeeMap.put(employeeArray[0], employee);
            }
            for (String element : employeeMap.keySet()){
                System.out.println(element + ", " + employeeMap.get(element));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void buyTickets() {
        LinkedList<String> ticketList = new LinkedList<>();
        File ticketFile = new File("src/data/Customer.csv");
        try {
            BufferedReader customerTicketsOutput = new BufferedReader(new FileReader(ticketFile));
            String line;
            if (ticketFile.length() > 0) {
                while ((line = customerTicketsOutput.readLine()) != null) {
                    String[] customerTicketsElements = line.split(",");
                    String name = customerTicketsElements[0];
                    String buyTickets = customerTicketsElements[8];
                    if (buyTickets.equals("Yes")) {
                        ticketList.add(name);
                    }
                }
                    System.out.println(ticketList);
            } else {
                System.out.println("No customer had bought tickets!");
            }
        } catch (IOException e) {
            System.out.println("Can't read this file!");
        }
    }

    public static void addBooking() {
        int position  = 1;
        ArrayList<Customer> customerList = new ArrayList<>();
        File customerFile = new File("src/data/Customer.csv");
        try {
            BufferedReader customerOutput = new BufferedReader(new FileReader(customerFile));
            String line;
            if (customerFile.length() > 0) {
                while ((line = customerOutput.readLine()) != null) {
                    String[] customerElements = line.split(",");
                    String name = customerElements[0];
                    String birth = customerElements[1];
                    String id = customerElements[2];
                    String gender = customerElements[3];
                    String email = customerElements[4];
                    String customerType = customerElements[5];
                    String address = customerElements[6];
                    String phoneNumber = customerElements[7];
                    String buyTickets = customerElements[8];
                    Customer customer = new Customer(name, birth, id, gender, email, customerType, address, phoneNumber, buyTickets);
                    customerList.add(customer);
                }
                Collections.sort(customerList);
                for (Customer customerObj : customerList) {
                    System.out.println(position++ + ", " +customerObj.showInfoWithoutService());
                }
            } else {
                System.out.println("Customer list is empty!");
            }
        } catch (IOException e) {
            System.out.println("Can't read this file!");
        }
        try {
            System.out.println("Choose what customer to booking: ");
            int choose = input.nextInt();
            Customer customer = customerList.get(choose - 1);
            int choice;
            System.out.println("1.Booking villa" + "\n2.Booking house" + "\n3.Booking room" + "\n4.Show booking list");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    Customer customerVilla = new Customer(customer.getName(), customer.getBirth(), customer.getId(), customer.getGender(), customer.getEmail()
                            , customer.getCustomerType(), customer.getAddress(), customer.getPhoneNumber(), customer.getBuyTickets(), "Had booking Villa");
                    try{
                        File bookingFile = new File("src/data/CustomerBooking.csv");
                        String customerBookingVilla = customerVilla.toString();
                        BufferedWriter customerBookVillaInput = new BufferedWriter(new FileWriter(bookingFile, true));
                        customerBookVillaInput.write(customerBookingVilla);
                        customerBookVillaInput.newLine();
                        customerBookVillaInput.close();
                    } catch (IOException e) {
                        System.out.println("Can't write this file!");
                    }
                    break;
                case 2:
                    Customer customerHouse = new Customer(customer.getName(), customer.getBirth(), customer.getId(), customer.getGender(), customer.getEmail()
                            , customer.getCustomerType(), customer.getAddress(), customer.getPhoneNumber(), customer.getBuyTickets(), "Had booking House");
                    try{
                        File bookingFile = new File("src/data/CustomerBooking.csv");
                        String customerBookingHouse = customerHouse.toString();
                        BufferedWriter customerBookHouseInput = new BufferedWriter(new FileWriter(bookingFile, true));
                        customerBookHouseInput.write(customerBookingHouse);
                        customerBookHouseInput.newLine();
                        customerBookHouseInput.close();
                    } catch (IOException e) {
                        System.out.println("Can't write this file!");
                    }
                    break;
                case 3:
                    Customer customerRoom = new Customer(customer.getName(), customer.getBirth(), customer.getId(), customer.getGender(), customer.getEmail()
                            , customer.getCustomerType(), customer.getAddress(), customer.getPhoneNumber(), customer.getBuyTickets(), "Had booking Room");
                    try{
                        File bookingFile = new File("src/data/CustomerBooking.csv");
                        String customerBookingRoom = customerRoom.toString();
                        BufferedWriter customerBookRoomInput = new BufferedWriter(new FileWriter(bookingFile, true));
                        customerBookRoomInput.write(customerBookingRoom);
                        customerBookRoomInput.newLine();
                        customerBookRoomInput.close();
                    } catch (IOException e) {
                        System.out.println("Can't write this file!");
                    }
                    break;
                case 4:
                    Set<Customer> customerSetBooking = new TreeSet<>();
                    File customerBooking = new File("src/data/CustomerBooking.csv");
                    try {
                        BufferedReader customerBookingOutput = new BufferedReader(new FileReader(customerBooking));
                        String line;
                        if (customerBooking.length() > 0) {
                            while ((line = customerBookingOutput.readLine()) != null) {
                                String[] customerElements = line.split(",");
                                String name = customerElements[0];
                                String birth = customerElements[1];
                                String id = customerElements[2];
                                String gender = customerElements[3];
                                String email = customerElements[4];
                                String customerType = customerElements[5];
                                String address = customerElements[6];
                                String phoneNumber = customerElements[7];
                                String buyTickets = customerElements[8];
                                String services = customerElements[9];
                                Customer customerBookingObj = new Customer(name, birth, id, gender, email, customerType, address, phoneNumber, buyTickets, services);
                                customerSetBooking.add(customerBookingObj);
                            }
                            for (Customer customerObj : customerSetBooking) {
                                System.out.println(customerObj.showInfoWithService());
                            }
                        } else {
                            System.out.println("Customer list is empty!");
                        }
                    } catch (IOException e) {
                        System.out.println("Can't read this file!");
                    }
                    break;
            }
            if (choice <= 0 || choice >= 5){
                System.out.println("Wrong input!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong input!");
        }

    }

    public static void findEmployees() {
        Stack<Employee> stackEmployees = new Stack<>();
        File employeeFile = new File("src/data/Employee.csv");
        try {
            BufferedReader employeeOutput = new BufferedReader(new FileReader(employeeFile));
            String line;
            while ((line = employeeOutput.readLine()) != null) {
                String[] employeeArray = line.split(",");
                Employee employee = new Employee(employeeArray[0], employeeArray[1], employeeArray[3] , Integer.parseInt(employeeArray[2]));
                stackEmployees.add(employee);
            }
            System.out.println("Input employee name: ");
            String employeeName = input.next();
            int index = 9;
            while (!stackEmployees.isEmpty()) {
                if (stackEmployees.peek().getName().equals(employeeName)){
                    System.out.println(stackEmployees.get(index).toString());
                }
                index--;
                stackEmployees.pop();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

