package lesson7.homeclassworks;

public class Phone {

    private String numberPhone;
    private String modelPhone;
    private int weight;

    public Phone() {
    }

    public Phone(String numberPhone, String modelPhone) {
        this.numberPhone = numberPhone;
        this.modelPhone = modelPhone;
    }

    public Phone(String numberPhone, String modelPhone, int weight) {
        this(numberPhone, modelPhone);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println(" " + name + " is calling");
    }

    public void receiveCall(String name, String number) {
        System.out.println(number + "  " + name + " is calling");
    }

    public static String getNumber(Phone phone) {
        System.out.println(" Number phone: " + phone.numberPhone);
        return phone.numberPhone.toString();
    }

    public static void printInfoAll(Phone phone) {
        System.out.println(" Number phone: " + phone.numberPhone
                + ",  Model phone:" + phone.modelPhone + ", Weight phone: "
                + phone.weight + "gr.");
    }

    public static void sendMessage(String... numbers) {
        System.out.println("Messages will be sent to these numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(" " + numbers[i] + " ");
        }
    }

}
