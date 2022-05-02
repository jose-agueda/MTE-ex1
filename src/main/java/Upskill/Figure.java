package Upskill;

public abstract class Figure {

    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "color='" + color + '\'' +
                '}';
    }


    public abstract double perimeter();
}
