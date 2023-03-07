package lesson7.homeclassworks;

public class BaseConverter {

    public static void convert(double temperCelsius){
        System.out.println("Temperature in Celsius ="+ temperCelsius +" C");
        System.out.println("Temperature in Kelvin =" + (temperCelsius + 273.15) +"K");
        System.out.println("Temperatura in Fahrenheit =" + (1.8 * temperCelsius + 32)+"F");
    }
}
