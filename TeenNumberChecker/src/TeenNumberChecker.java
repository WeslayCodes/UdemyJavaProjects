public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean hasTeen(int i1, int i2, int i3) {
        return isTeen(i1) || isTeen(i2) || isTeen(i3);
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }
}