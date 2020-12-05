package fan_class;

public class Main_class {
    public static void main(String[] args) {
        final int  slow = 1, medium = 2, fast = 3;
        Fan_class Fan1 = new Fan_class();
        Fan_class Fan2 = new Fan_class();
        Fan1.setSpeed(fast);
        Fan1.setRadius(10);
        Fan1.setOn(true);
        Fan1.setColor("Yellow");
        Fan2.setSpeed(medium);
        System.out.println(Fan1.toStrings());
        System.out.println(Fan2.toStrings());
    }
}
