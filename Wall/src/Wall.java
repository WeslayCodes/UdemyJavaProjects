public class Wall {
    private double width;
    private double height;

    public Wall() {}

    public Wall(double w, double h) {
        if (w < 0)
            width = 0;
        else
            width = w;

        if (h < 0)
            height = 0;
        else
            height = h;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        if (w < 0)
            width = 0;
        else
            width = w;
    }

    public void setHeight(double h) {
        if (h < 0)
            height = 0;
        else
            height = h;
    }

    public double getArea() {
        return width * height;
    }
}
