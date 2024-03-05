public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    // Calculate area of circle
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }

        return Math.PI * radius * radius;
    }

    // Calculate area of rectangle
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }
}