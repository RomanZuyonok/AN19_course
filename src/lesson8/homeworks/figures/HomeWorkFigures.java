package lesson8.homeworks.figures;

import java.util.Random;

public class HomeWorkFigures {

    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5d);
        Circle circle2 = new Circle(5.0d);

        System.out.println(circle1.square() + " Square");
        System.out.println(circle1.perimeter() + "Perimeter");

        Rectangle rectangle1 = new Rectangle(10.0d, 15.0d);
        Rectangle rectangle2 = new Rectangle(15.5d, 12.6d);
        System.out.println(rectangle1.square() +" Square");
        System.out.println(rectangle1.perimeter()+"Perimeter");

        Triangle triangle1 = new Triangle(7.0d,5.0d,6.0d);
        System.out.println(triangle1.square()+" Square");
        System.out.println(triangle1.perimeter()+"Perimeter");

        Figures[] figures = new Figures[5];
        figures[0] = circle1;
        figures[1] = circle2;
        figures[2] = rectangle1;
        figures[3] = rectangle2;
        figures[4] = triangle1;

       /* Random random = new Random(10);
        double a;
        for (int i = 0; i < figures.length; i++) {
            a = random.nextDouble();
            figures[i] = new Circle(a);

        }*/

        double sum = figures[0].perimeter();

        for (int i = 1; i < figures.length; i++) {
              sum += figures[i].perimeter();
        }
        System.out.println("Sum =" + sum);




    }
}
