package lesson6.homework6;

public class Cat {
    // task 5 of class practice
    String nameCat;
    int ageCat;
    int catSaturation = 150;

    public Cat() {
    }

    public Cat(String nameCat) {
        this.nameCat = nameCat;
    }

    public Cat(String nameCat, int ageCat) {
        this.nameCat = nameCat;
        this.ageCat = ageCat;
    }

    public Cat(String nameCat, int ageCat, int catSaturation) {
        this.nameCat = nameCat;
        this.ageCat = ageCat;
        this.catSaturation = catSaturation;
    }

    boolean feedCat(int amountFeed){
        if(catSaturation == amountFeed){
            return true;
        }else{
            return false;
        }

    }
}
