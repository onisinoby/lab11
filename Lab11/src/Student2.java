class Student2 {
    private String firstName;
    private String lastName;
    private int IDNumber;
    private double GPA;

    public Student2(String firstName, String lastName, int IDNumber, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNumber = IDNumber;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + " (ID: " + IDNumber + ", GPA: " + GPA + ")";
    }
}
