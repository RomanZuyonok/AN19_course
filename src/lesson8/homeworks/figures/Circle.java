package lesson8.homeworks.figures;

public class Circle extends Figures {

    private double radius;
    private static final double PI = 3.14d;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }

    @Override
    public double square() {
        return PI*(radius*radius);
    }
}
