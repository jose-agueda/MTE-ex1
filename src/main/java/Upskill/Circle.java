package Upskill;

public class Circle extends Figure{

    private double raio;

    public Circle(Color color, double raio) {
        super(color);
        this.raio = raio;
    }

    @Override
    public double perimeter() {
        return 2* Math.PI * raio;
    }

    @Override
    public double area() {
        return Math.PI*(raio*raio);
    }
}
