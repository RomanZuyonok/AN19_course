package lesson7.homeclassworks;

import java.util.Objects;

public class ClassWork1 {

    public static void main(String[] args) {

        // task classwork number 1
        System.out.println("task classwork number 1");
        //DaysOfWeek.printStatusDays();
        DaysOfWeek.printDays();

        // task classwork number 2
        System.out.println("task classwork number 2");
        Converter converter = new Converter();

        converter.convertCelsius(2.5);
        converter.convertKelvin(15.5);
        converter.convertFahrenheit(25.0);

        // task classwork number 2 - 2 ed.

        System.out.println("kelvin = " + converter.getConvertKelvin(20) + "K ;   Fahrenheit = "
                + converter.getConvertFahrenheit(35) + "F");

    }
}
