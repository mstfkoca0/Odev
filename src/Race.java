import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Race {
    private List<Student> students;

    public Race(List<Student> students) {
        this.students = students;
    }

    public void printTopThree() {
        Collections.sort(students, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getTime(), s2.getTime());
            }
        });
        System.out.println("Birinci: " + students.get(0).getName() + " " + students.get(0).getTime());
        System.out.println("İkinci: " + students.get(1).getName() + " " + students.get(1).getTime());
        System.out.println("Üçüncü: " + students.get(2).getName() + " " + students.get(2).getTime());
    }

    public void classifyStudents() {
        Collections.sort(students, new Comparator<Student>() {

            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getTime(), s2.getTime());
            }
        });

        int[] classifications = {200, 300, 400};
        int countA = 0;
        int countB = 0;
        int countC = 0;

        for (Student student : students) {
            int time = student.getTime();
            if (time < classifications[0]) {
                System.out.println(student.getName() + " A");
            } else if (time < classifications[1]) {
                System.out.println(student.getName() + " B");
                countB++;
            } else {
                System.out.println(student.getName() + " C");
                countC++;
            }
        }

        System.out.println("A -> " + countA);
        System.out.println("B -> " + countB);
        System.out.println("C -> " + countC);
    }
}