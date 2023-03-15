package lesson7.homeclassworks;

public class Converter extends BaseConverter {
    @Override
    public void convertCelsius(double temperCelsius) {
        System.out.println("Temperature in Celsius =" + temperCelsius + " C");
    }

    @Override
    public void convertKelvin(double temperCelsius) {
        System.out.println("Temperature in Kelvin =" + (temperCelsius + 273.15) + "K");
    }

    @Override
    public void convertFahrenheit(double temperCelsius) {
        System.out.println("Temperature in Fahrenheit =" + (1.8 * temperCelsius + 32) + "F");
    }

    @Override
    public double getConvertKelvin(double temperCelsius) {
        return temperCelsius + 273.15;
    }

    @Override
    public double getConvertFahrenheit(double temperCelsius) {
        return 1.8 * temperCelsius + 32;
    }
}
