package Upskill;

public class Rectangle extends Figure{

    private double comprimento;
    private double largura;

    public Rectangle(Color color, double comprimento, double largura) {
        super(color);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }


    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

        @Override
        public double perimeter() {
            return 0;
   }

    @Override
    public double area() {
        return 0;
    }

}
