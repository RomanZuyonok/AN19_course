package lesson9.homework;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car;
        int amount = 0;
        Parking parking = new Parking();

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Enter number:");
            int years = scanner.nextInt();

            System.out.println("Number of cars this year = "+ parking.countByYears(years)+" pcs.");
            scanner.reset();
            System.out.print("Enter the VIN of the car:");
            String vin = scanner.next();

            car = parking.checkCar(vin);
            if(car != null) {
                System.out.println(car.toString());
            }

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (NullPointerException e){
            System.out.println("Sending an error report.... ");
        }finally {
            scanner.close();
        }


    }
}
