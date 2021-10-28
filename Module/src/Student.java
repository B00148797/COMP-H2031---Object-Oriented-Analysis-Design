public class Student {

    public String firstName;
    public String surname;
    public double gpa;

    public Student() {

    }

    public Student(int newGpa, String newFirstName, String newSurname) {
        this.gpa = newGpa;
        this.firstName = newFirstName;
        this.surname = newSurname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
