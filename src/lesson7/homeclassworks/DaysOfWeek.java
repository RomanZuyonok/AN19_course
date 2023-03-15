package lesson7.homeclassworks;

public enum DaysOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String title;

    DaysOfWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "DaysOfWeek{" +
                "title='" + title + '\'' +
                '}';
    }

    public static void printDays(){
        for (DaysOfWeek daysOfWeek: DaysOfWeek.values()) {
            if(daysOfWeek.ordinal() < 5){
                System.out.println(daysOfWeek.title.toString() + " - it's a work day");
            } else {
                System.out.println(daysOfWeek.getTitle() + " - it's a holiday");
            }
        }

    }
}
