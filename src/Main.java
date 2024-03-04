import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Firat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            students.add(new Student(names[i], times[i]));
        }

        Race race = new Race(students);
        race.printTopThree();

        int[] classifications = {200, 300, 400};
        System.out.print("A -> ");
        int countA = 0;
        for (int time : times) {
            if (time < classifications[1]) {
                countA++;
            }
        }
        System.out.println(countA);

        System.out.print("B -> ");
        int countB = 0;
        for (int time : times) {
            if (time >= classifications[0] && time < classifications[1]) {
                countB++;
            }
        }
        System.out.println(countB);

        System.out.print("C -> ");
        int countC = 0;
        for (int time : times) {
            if (time >= classifications[1]) {
                countC++;
            }
        }
        System.out.println(countC);
    }
}