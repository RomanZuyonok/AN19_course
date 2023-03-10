package lesson8.homeworks;

import java.util.Calendar;

public class Cat extends Animal{

    String eyesColor;

    public Cat(int animal_id, String name, Calendar birthday, String eyesColor) {
        super(animal_id, name, birthday);
        this.eyesColor = eyesColor;
    }

    @Override
    public void makeSounds() {
        System.out.println("Meow meow" + eyesColor);
    }

    @Override
    public void sleep() {
        System.out.println("Sleepppppppp ......");
    }

    @Override
    public void eating() {
        System.out.println("Eating ......");
    }

    @Override
    public void moving() {
        System.out.println("Moving");
    }

    @Override
    public void foodSearch() {
        System.out.println("Food search");
    }

    public static void play(){
        System.out.println("Play");
    }
}
