package stop_watch;
import java.util.Scanner;
public  class Stop_Watch {
    private double startTime, endTime;
    public double getStartTime() {
        return System.currentTimeMillis();
    }
    public double getEndTime() {
        return System.currentTimeMillis();
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
    public static void main(String[] args) {
        Stop_Watch sw1 = new Stop_Watch();
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            System.out.print("Enter order: ");
            String order = input.nextLine();
            if(order.equals("Start")){
                System.out.println(sw1.getStartTime());
                sw1.start();
            } else if(order.equals("Stop")){
                System.out.println(sw1.getEndTime());
                sw1.stop();
            } else {
                System.out.println("Wrong input!");
                i--;
            }
        }
        System.out.println(sw1.getElapsedTime());
    }
}

