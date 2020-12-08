package point2d_point3d;

public class Point2D {
    private double  x,y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double[] getXY() {
        double arrayPoint2D [] = {this.x, this.y};
        return arrayPoint2D;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
