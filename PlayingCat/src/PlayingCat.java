public class PlayingCat {
    public static void main(String[] args) {}

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean summerTemp = temperature <= 45 && temperature >= 25;
        boolean notSummerTemp = temperature <= 35 && temperature >= 25;

        return summer && summerTemp || !summer && notSummerTemp;
    }
}