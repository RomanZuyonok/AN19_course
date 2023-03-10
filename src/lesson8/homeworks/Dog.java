package lesson8.homeworks;

import java.math.BigDecimal;
import java.util.Calendar;

public class Dog extends Animal {

    BigDecimal weight;

    public Dog(int animal_id, String name, Calendar birthday, BigDecimal weight) {
        super(animal_id, name, birthday);
        this.weight = weight;
    }

    @Override
    public void makeSounds() {
        System.out.println("Bow-wow");
    }

    @Override
    public void sleep() {
        System.out.println("Sleepppppppp ......");
    }

    @Override
    public void eating() {
        System.out.println("Eating ......" + weight + "kg");
    }

    @Override
    public void moving() {
        System.out.println("Moving");
    }

    @Override
    public void foodSearch() {
        System.out.println("Food search");
    }


}
