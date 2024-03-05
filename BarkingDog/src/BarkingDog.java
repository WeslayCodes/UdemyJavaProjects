public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(true, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    // Returns whether to wake up based on hour of the day and dog barking
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeEarly = hourOfDay < 8 && hourOfDay >= 0;
        boolean wakeLate = hourOfDay == 23;

        return barking && (wakeEarly || wakeLate);
    }
}