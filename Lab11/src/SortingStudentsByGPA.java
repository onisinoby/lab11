import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student2> {
    public static void main(String[] args) {
        Student2[] students = {
                new Student2("John", "Doe", 1234, 3.8),
                new Student2("Alice", "Smith", 5678, 3.5),
                new Student2("Bob", "Johnson", 9012, 4.0)
        };

        System.out.println("Before sorting: ");
        for (Student2 student : students) {
            System.out.println(student);
        }

        // Perform quick sort on students array by GPA
        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("After sorting by GPA (descending order): ");
        for (Student2 student : students) {
            System.out.println(student);
        }
    }

    @Override
    public int compare(Student2 s1, Student2 s2) {
        if (s1.getGPA() < s2.getGPA()) {
            return 1;
        } else if (s1.getGPA() > s2.getGPA()) {
            return -1;
        } else {
            return 0;
        }
    }
}
