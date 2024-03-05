public class PaintJob {
    public static void main(String[] args) {
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        boolean invalidInput = width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0;

        if (invalidInput) {
            return -1;
        }

        return (int) Math.ceil((width * height - extraBuckets * areaPerBucket) / areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        boolean invalidInput = width <= 0 || height <= 0 || areaPerBucket <= 0;

        if (invalidInput) {
            return -1;
        }

        return (int) Math.ceil(width * height / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        boolean invalidInput = area <= 0 || areaPerBucket <= 0;

        if (invalidInput) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }
}