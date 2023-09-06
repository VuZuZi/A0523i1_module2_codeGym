package ss6_ke_thua.bai_tap.thiet_ke_triangle;

public class Shape {
    private String color;
    private boolean filler;

    public Shape() {
    }

    public Shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filler=" + filler +
                '}';
    }
}
