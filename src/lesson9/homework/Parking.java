package lesson9.homework;

import java.time.ZoneId;
import java.util.Date;

public class Parking {
    private Car[] cars = {new Car("Polo", "ZVW1234543RR0001", 160, "2013"),
            new Car("Corsa", "PL34567543345HHH1", 130, "2016"),
            new Car("Stepway", "RNL321456743G565X", 125, "2017"),
            new Car("RAV4", "TTR94838986591708236326", 190, "2020"),
            new Car("Touran", "VVW46826184610G9807", 180, "2019"),
            new Car("I3", "BNW76532865286865082", 110, "2022")
    };
    private Date date = new Date();
    private int localDate = date.toInstant().atZone(ZoneId.systemDefault()).getYear();
    public Parking() {
    }
    public Car checkCar(String vin) throws NullPointerException {
        if (vin != null) {
            for (int i = 0; i < cars.length; i++) {
                if (cars[i].getVin().equals(vin)) {
                    return cars[i];
                }
            }
            return null;
        }
        return null;
    }

    public int countByYears(int years) throws NumberFormatException {
        int year;
        int amount = 0;
        for (int i = 0; i < cars.length; i++) {
            year = Integer.parseInt(cars[i].getYearManufacture());
            if ((localDate - years) <= year) {
                amount += 1;
            }
        }
        return amount;
    }

}
