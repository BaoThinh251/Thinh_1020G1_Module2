package static_property;

public class Static_property {
        public static class Car {
            private String name;
            private String engine;
            public static int numberOfCars;

            public Car(String name, String engine) {
                this.name = name;
                this.engine = engine;
                numberOfCars++;
            }
            public String  getName(){
                return this.name;
            }
            public String getEngine(){
                return this.engine;
            }
        }

        public static class TestStaticProperty {

            public static void main(String[] args) {

                Car car1 = new Car("Mazda 3", "Skyactiv 3");

                System.out.println(Car.numberOfCars + " " + car1.name + " " + car1.engine);

                Car car2 = new Car("Mazda 6", "Skyactiv 6");

                System.out.println(Car.numberOfCars + " " + car2.getName() + " " + car2.getEngine());

            }
        }
}
