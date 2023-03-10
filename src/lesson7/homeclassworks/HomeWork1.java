package lesson7.homeclassworks;

public class HomeWork1 {

    public static void main(String[] args) {

        // task homework number 1
        // создание трех объектов
        Phone phone1 = new Phone("+375 29 684 25 87", "Motorola X", 100);
        Phone phone2 = new Phone("+375 29 578 96 21", "Sony Experia", 110);
        Phone phone3 = new Phone("+375 29 159 35 75", "Iphone I10", 90);
        // вывод информации о каждом телефоне
        System.out.println("Phone 1");
        Phone.printInfoAll(phone1);
        System.out.println("Phone 2");
        Phone.printInfoAll(phone2);
        System.out.println("Phone 3");
        Phone.printInfoAll(phone3);
        //вызов метода getNumber для кажого объекта
        String number = Phone.getNumber(phone1);
        System.out.println(number + " return number");
        number = Phone.getNumber(phone2);
        System.out.println(number + " return number");
        number = Phone.getNumber(phone3);
        System.out.println(number + " return number");
        //вызов метода receiveCall для каждого объекта
        phone1.receiveCall("Jack");
        phone2.receiveCall("Max");
        phone3.receiveCall("Agnes");
        //вывзов перегруженного метода receiveCall для каждого объекта
        phone1.receiveCall("Max", "+375 29 684 25 87");
        phone2.receiveCall("Jack", "+375 29 578 96 21");
        phone3.receiveCall("Agnes", "+375 29 159 35 75");
        //вызов метода sendMessage
        Phone.sendMessage("+375 29 357 25 78","+375 29 658 87 21","+375 29 159 25 55");


    }
}
