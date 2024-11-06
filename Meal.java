public class Meal {
    private String name;
    private int count;
    private boolean done;

    public Meal(String name, int count) {
        this.name = name;
        this.count = count;
        done = false;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
