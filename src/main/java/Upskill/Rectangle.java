package Upskill;

public class Rectangle extends Figure{

    private double comprimento;
    private double largura;

    public Rectangle(String color, double comprimento, double largura) {
        super(color);
        this.comprimento = comprimento;
        this.largura = largura;
    }


    @Override
    public double perimeter() {
        return 0;
    }
}
