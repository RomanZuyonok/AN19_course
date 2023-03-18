package lesson9.homework;

public class Car {
    private String model;
    private String vin;

    private int maxSpeed;

    private String yearManufacture;

    public Car(String model, String vin, int maxSpeed, String yearManufacture) {
        this.model = model;
        this.vin = vin;
        this.maxSpeed = maxSpeed;
        this.yearManufacture = yearManufacture;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getYearManufacture() {
        return yearManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model ='" + model + '\'' +
                ", VIN ='" + vin + '\'' +
                ", Max Speed =" + maxSpeed + " km/h"+
                ", Produced ='" + yearManufacture + '\'' + " year "+
                '}';
    }
}
