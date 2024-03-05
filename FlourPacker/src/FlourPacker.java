public class FlourPacker {
    private final static int BIG_WEIGHT = 5;

    public static void main(String[] args) {}

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int numSmallNeeded = goal / BIG_WEIGHT <= bigCount
            ? goal - goal / BIG_WEIGHT * BIG_WEIGHT // Note: Integer division
            : goal - bigCount * BIG_WEIGHT;

        return numSmallNeeded <= smallCount;
    }
}