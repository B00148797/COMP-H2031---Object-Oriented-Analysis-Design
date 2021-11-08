public class Lecturer extends Employee{
    private FacultyType faculty;

    public Lecturer(String name) {
        super(name);
    }

    public FacultyType getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyType faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "(" + getStaffNumber() + ") " + getName() + ", faculty of " + getFaculty() + " (full time = " + getFullTime() + ")";
    }
}