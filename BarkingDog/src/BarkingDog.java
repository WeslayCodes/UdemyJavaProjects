public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(true, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return barking && (hourOfDay < 8 && hourOfDay >= 0 || hourOfDay > 22 && hourOfDay <= 23);
    }
}