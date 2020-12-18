import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class TestClient  {
    public static void main(String[] args) {
        ProductManager.runFirst();
        Scanner input = new Scanner(System.in);
        int choose = 0;

        while(choose != -1) {
            System.out.println(" Product List" + "\n 1.Display all product" + "\n 2.Add new product"
            + "\n 3.Edit product by ID" + "\n 4.Delete product by ID" + "\n 5.Find product by name"
            + "\n 6.Sorting by price (low - high)" + "\n 7.Sorting by price (high - low)" + "\n 0.Exit");
            System.out.print(" Input your order: ");
            choose = input.nextInt();
            switch (choose){
                case 1:
                    ProductManager.displayProduct();;
                    break;
                case 2:
                    ProductManager.addProduct();
                    break;
                case 3:
                    ProductManager.editProduct();
                    break;
                case 4:
                    ProductManager.deleteProduct();
                    break;
                case 5:
                    ProductManager.findProduct();
                    break;
                case 6:
                    ProductManager.sortByPrice();
                    break;
                case 7:
                    ProductManager.sortByPriceReverse();
                    break;
                case 0:
                    choose = -1;
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        }
        System.out.println("Thank for using!");
    }
}
