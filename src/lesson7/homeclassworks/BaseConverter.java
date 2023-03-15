package lesson7.homeclassworks;


public abstract class BaseConverter {

    public abstract void convertCelsius(double temperCelsius);


    public abstract void convertKelvin(double temperCelsius);

    public abstract double getConvertKelvin(double temperCelsius);

    public abstract void convertFahrenheit(double temperCelsius);

    public abstract double getConvertFahrenheit(double temperCelsius);
}
