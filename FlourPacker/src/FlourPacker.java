public class FlourPacker {
    public static void main(String[] args) {

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        int numSmallNeeded;

        if (goal / 5 <= bigCount)
            numSmallNeeded = goal - goal / 5 * 5;
        else
            numSmallNeeded = goal - bigCount * 5;

        return numSmallNeeded <= smallCount;
    }
}