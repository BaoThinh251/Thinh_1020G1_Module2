import java.util.Comparator;

public class CompareByPriceReverse implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice() - o1.getPrice());
        }
}
