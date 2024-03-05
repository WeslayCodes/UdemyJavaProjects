public class DiagonalStar {
    private static final String STAR = "*";
    private static final String SPACE = " ";
    private static final String INVALID_VALUE_RESPONSE = "Invalid Value";

    public static void main(String[] args) {
        printSquareStar(10);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println(INVALID_VALUE_RESPONSE);
            return;
        }

        for (int i=0; i<number; i++) {
            for (int j=0; j<number; j++) {
                boolean isEdge = i == 0 || j == 0 || i == number-1 || j == number-1;
                boolean isCross = i == j || j == number - i - 1;

                if (isEdge || isCross) {
                    System.out.print(STAR);
                } else {
                    System.out.print(SPACE);
                }
            }

            System.out.println();
        }
    }
}