package lesson8.homeworks.figures;

public class Rectangle extends Figures{

    private double sideA;

    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double perimeter() {
        return sideA+sideA+sideB+sideB;
    }

    @Override
    public double square() {
        return sideA*sideB;
    }
}
