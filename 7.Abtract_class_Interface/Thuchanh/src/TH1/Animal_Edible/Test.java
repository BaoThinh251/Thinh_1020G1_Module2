package Animal_Edible;
import Fruit.Fruit;
import Fruit.Orange;
import Fruit.Apple;
public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
