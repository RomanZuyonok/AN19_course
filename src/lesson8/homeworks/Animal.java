package lesson8.homeworks;

import java.util.Calendar;

public abstract class Animal {

    int animal_id;
    String name;
    Calendar birthday;
    public Animal(int animal_id, String name, Calendar birthday) {
        this.animal_id = animal_id;
        this.name = name;
        this.birthday = birthday;
    }
    public abstract void  makeSounds();
    public abstract void sleep();

    public abstract void eating();

    public abstract void moving();

    public abstract void foodSearch();


}
