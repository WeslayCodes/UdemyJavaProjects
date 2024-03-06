public class Wall {
    private double width;
    private double height;

    public Wall() {}

    public Wall(double w, double h) {
        setWidth(w);
        setHeight(h);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        width = w < 0 ? 0 : w;
    }

    public void setHeight(double h) {
        height = h < 0 ? 0 : h;
    }

    public double getArea() {
        return width * height;
    }
}
