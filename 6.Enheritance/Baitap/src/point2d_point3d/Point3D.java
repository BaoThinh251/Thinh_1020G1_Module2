package point2d_point3d;

public class Point3D  extends Point2D{
    private double z;
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public double[] getXYZ() {
        double arrayPoint3D[] = {super.getX(), super.getY(), this.z};
        return arrayPoint3D;
    }
    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
}
