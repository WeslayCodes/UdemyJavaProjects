public class SpeedConverter {
    public static void main(String[] args) {
        toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (toMilesPerHour(kilometersPerHour) == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + (toMilesPerHour(kilometersPerHour)) + " mi/h");
        }
    }
}