import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();
    public static void main(String[] args) {
        int choice = 0;
        do {
            System.out.println("1.Add new product" + "\n2.Show product"
                    + "\n3.Find product by ID" + "\n4.Exit");
            System.out.println("Input your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProduct();
                    break;
                case 3:
                    findProductByID();
                    break;
            }
        } while (choice >= 1 && choice < 4);
        if (choice == 4) {
            System.out.println("End program!");
        } else {
            System.out.println("Wrong input please try again!");

        }
    }

    public static void readProduct(){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/ProductList.csv"));
            productList = (List<Product>) objectInputStream.readObject();
        }catch (EOFException e){
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addProduct(){
        readProduct();
        System.out.println("Enter id: ");
        int id = input.nextInt();
        System.out.println("Enter name: ");
        String name= input.next();
        System.out.println("Enter Brand");
        String brand = input.next();
        System.out.println("Enter price: ");
        double price=input.nextDouble();
        System.out.println("Enter descriptionsOther");
        String description=input.next();
        Product product = new Product(name, id, price, brand, description);
        productList.add(product);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/ProductList.csv"));
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch(EOFException e){
            System.out.println("File are empty!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showProduct(){
        readProduct();
        for (Product element : productList){
            System.out.println(element.toString());
        }
    }

    public static void findProductByID(){
        System.out.println("Enter id: ");
        int id = input.nextInt();
        readProduct();
        boolean check = false;
        for (int i = 0; i<productList.size(); i++){
            if (productList.get(i).getId() == id){
                System.out.println(productList.get(i).toString());
                check = true;
            }
        }
        if(!check){
            System.out.println("Id không hợp lệ!!");
        }
    }
}

