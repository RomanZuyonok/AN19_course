package homeworks14;

public class LiftOff implements Runnable {
    protected int counter = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
    }

    public LiftOff(int counter) {
        this.counter = counter;
    }

    public String status() {
        return "#" + (id+1) + "(" + (counter > 0 ? counter : "LiftOff!"  ) +"), ";
    }

    @Override
    public void run() {
        while (counter-- > 0){
            System.out.print(status());
            Thread.yield();
        }
    }
}
