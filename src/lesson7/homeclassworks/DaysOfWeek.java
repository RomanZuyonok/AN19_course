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

    /*public static void statusDay(DaysOfWeek daysOfWeek) {
        switch (daysOfWeek) {
            case MONDAY:
                System.out.println(daysOfWeek.title + " - it's a work day");
                break;
            case TUESDAY:
                System.out.println(daysOfWeek.title + " - it's a work day");
                break;
            case WEDNESDAY:
                System.out.println(daysOfWeek.title + " - it's a work day");
                break;
            case THURSDAY:
                System.out.println(daysOfWeek.title + " - it's a work day");
                break;
            case FRIDAY:
                System.out.println(daysOfWeek.title + " - it's a work day");
                break;
            case SATURDAY:
                System.out.println(daysOfWeek.title + " - it's a holiday");
                break;
            case SUNDAY:
                System.out.println(daysOfWeek.title + " - it's a holiday");
                break;
            default:
                System.out.println();
        }
    }*/

    public static void printStatusDays() {
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    System.out.println(DaysOfWeek.MONDAY.title + " - it's a work day");
                    break;
                case 1:
                    System.out.println(DaysOfWeek.TUESDAY.title + " - it's a work day");
                    break;
                case 2:
                    System.out.println(DaysOfWeek.WEDNESDAY.title + " - it's a work day");
                    break;
                case 3:
                    System.out.println(DaysOfWeek.THURSDAY.title + " - it's a work day");
                    break;
                case 4:
                    System.out.println(DaysOfWeek.FRIDAY.title + " - it's a work day");
                    break;
                case 5:
                    System.out.println(DaysOfWeek.SATURDAY.title + " - it's a holiday");
                    break;
                case 6:
                    System.out.println(DaysOfWeek.SUNDAY.title + " - it's a holiday");
                    break;
            }
        }

    }
}
