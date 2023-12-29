import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void mergeSort(List<Student> students, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(students, start, middle);
            mergeSort(students, middle + 1, end);
            merge(students, start, middle, end);
        }
    }

    private static void merge(List<Student> students, int start, int middle, int end) {
        List<Student> temp = new ArrayList<>();
        int i = start;
        int j = middle + 1;
        while (i <= middle && j <= end) {
            if (students.get(i).compareTo(students.get(j)) <= 0) {
                temp.add(students.get(i));
                i++;
            } else {
                temp.add(students.get(j));
                j++;
            }
        }
        while (i <= middle) {
            temp.add(students.get(i));
            i++;
        }
        while (j <= end) {
            temp.add(students.get(j));
            j++;
        }
        for (int k = start; k <= end; k++) {
            students.set(k, temp.get(k - start));
        }
    }

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("John", "Doe", 33));
        students1.add(new Student("Jane", "Smith", 12));
        students1.add(new Student("Mike", "Johnson", 21));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Anna", "Brown", 63));
        students2.add(new Student("Peter", "Davis", 44));
        students2.add(new Student("Emily", "Wilson", 56));

        students1.addAll(students2);

        mergeSort(students1, 0, students1.size() - 1);

        for (Student student : students1) {
            System.out.println(student.getFirstname() + " " + student.getLastname() + " " + student.getId());
        }
    }
}
