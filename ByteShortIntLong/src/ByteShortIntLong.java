public class ByteShortIntLong {
    public static void main(String[] args) {
        byte byteValue = 63;
        short shortValue = 1231;
        int intValue = 12338123;
        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println(longValue);
    }
}