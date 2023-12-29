public class Student implements Comparable<Student> {
    private String firstname;
    private String lastname;
    private int id;

    public Student(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}