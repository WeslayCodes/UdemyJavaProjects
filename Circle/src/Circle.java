public class Circle {
    private final double radius;

    public Circle(double r) {
        if (r < 0) {
            r = 0;
        }

        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
