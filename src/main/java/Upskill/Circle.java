package Upskill;

public class Circle extends Figure{

    private double raio;

    public Circle(String color, double raio) {
        super(color);
        this.raio = raio;
    }

    @Override
    public double perimeter() {
        return 2* Math.PI * raio;
    }
}
