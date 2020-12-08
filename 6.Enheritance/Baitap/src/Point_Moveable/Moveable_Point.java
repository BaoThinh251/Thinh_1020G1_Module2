package Point_Moveable;

public class Moveable_Point extends Point{
    private double xSpeed, ySpeed;
    public Moveable_Point() {
    }
    public Moveable_Point(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public Moveable_Point(double x, double y, double xSpeed, double ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public double getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }
    public double getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public double[] getSpeed() {
        double arraySpeed [] = {this.xSpeed, this.ySpeed};
        return arraySpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", xSpeed is: " + getXSpeed() + ", ySpeed is: " + getYSpeed();
    }
}
