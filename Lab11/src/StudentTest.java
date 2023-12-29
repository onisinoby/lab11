import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student3[] students = new Student3[5];
        students[0] = new Student3("John", "Doe", 12345);
        students[1] = new Student3("Jane", "Doe", 54321);
        students[2] = new Student3("Alice", "Smith", 98765);
        students[3] = new Student3("Bob", "Johnson", 67890);
        students[4] = new Student3("Eve", "Anderson", 45678);

        // Сортировка массива iDNumber методом вставок
        for (int i = 1; i < students.length; i++) {
            Student3 current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > current.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }

        for (Student3 student : students) {
            System.out.println(student.getIDNumber());
        }
    }
}