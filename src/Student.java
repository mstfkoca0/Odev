public class Student {
    private String name;
    private int time;

    public Student(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public String toString() {
        return name + " " + time;
    }
}
