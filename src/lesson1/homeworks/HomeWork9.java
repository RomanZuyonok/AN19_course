package lesson1.homeworks;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args){
        Scanner initialAmountIn = new Scanner(System.in);
        Scanner numberOfMonthsIn = new Scanner(System.in);

        float depositPercentage = 7.00f;
        float amountWithInterest = 0.00f;

        System.out.print("Enter the amount you want to deposit (USD): ");
        float initialAmount = initialAmountIn.nextFloat();

        System.out.print("Enter the number of months for which you want to deposit (Months): ");
        float numberOfMonths = numberOfMonthsIn.nextFloat();

        for (int i = 1; i <= numberOfMonths ; i++) {
            initialAmount += (initialAmount*7/100);
            amountWithInterest = initialAmount;
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.print("After "+ numberOfMonths +" months, the amount with "+ depositPercentage
                +" percent will be equal to " + Math.round(amountWithInterest * 100.0f)/100.0f + " USD");

    }
}
