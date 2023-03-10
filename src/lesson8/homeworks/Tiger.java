package lesson8.homeworks;

import java.util.Calendar;

public class Tiger extends Cat{

    static int countEatenExployees;

    public Tiger(int animal_id, String name, Calendar birthday, String eyesColor, int countEatenExployees) {
        super(animal_id, name, birthday, eyesColor);
        this.countEatenExployees = countEatenExployees;
    }

    @Override
    public void makeSounds() {
        System.out.println("Roar.....");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void eating() {
        super.eating();
    }

    @Override
    public void moving() {
        super.moving();
    }

    @Override
    public void foodSearch() {
        System.out.println("Hunt .....");
    }

    public static boolean amountFood(int countEaten){
        if (countEaten >= countEatenExployees){
            return true;
        }
        return false;
    }

}
