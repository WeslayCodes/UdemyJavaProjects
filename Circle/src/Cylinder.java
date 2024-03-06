public class Cylinder extends Circle {
    private double height;

    public Cylinder(double r, double h) {
        super(r);

        if (h < 0) {
            h = 0;
        }

        height = h;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea() * height;
    }
}
