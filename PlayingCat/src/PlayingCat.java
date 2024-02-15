public class PlayingCat {
    public static void main(String[] args) {

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        return summer && temperature <= 45 && temperature >= 25 ||
                !summer && temperature <= 35 && temperature >= 25;
    }
}