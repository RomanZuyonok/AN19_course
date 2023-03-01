package lesson6.homework6;

public class ATMMachine {

    private int amount20Banknotes;
    private int amount50Banknotes;
    private int amount100Banknotes;

    public ATMMachine(int amount20Banknotes, int amount50Banknotes, int amount100Banknotes) {
        this.amount20Banknotes = amount20Banknotes;
        this.amount50Banknotes = amount50Banknotes;
        this.amount100Banknotes = amount100Banknotes;
    }

    void addingMoney(int inCash) {
        if (inCash % 20 == 0) {
            amount20Banknotes = inCash / 20;
        } else if (inCash % 50 == 0) {
            amount50Banknotes = inCash / 50;
        } else if (inCash % 100 == 0) {
            amount100Banknotes = inCash / 100;
        } else {
            System.out.println("Error 404)");
        }
    }

    boolean paymentMoney(int outCash) {
        int number = 0;
        if (outCash % 20 == 0) {
            number = outCash / 20;
            if (amount20Banknotes >= number) {
                amount20Banknotes -= number;
                System.out.print("The number of banknotes in denominations of 20 was =" + number);
                return true;
            }
            return false;
        } else if (outCash % 50 == 0) {
            number = outCash / 50;
            if (amount50Banknotes >= number) {
                amount50Banknotes -= number;
                System.out.print("The number of banknotes in denominations of 50 was =" + number);
                return true;
            }
            return false;
        } else if (outCash % 100 == 0) {
            number = outCash / 100;
            if (amount100Banknotes >= number) {
                amount100Banknotes -= number;
                System.out.print("The number of banknotes in denominations of 100 was =" + number);
                return true;
            }
            return false;
        } else {
            return false;
        }

    }
}
