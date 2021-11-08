public class Main {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Sean Murphy");
        lecturer.setStaffNumber(88);
        lecturer.setFullTime(false);
        lecturer.setFaculty(FacultyType.ARTS);

        System.out.println(lecturer);

        System.out.println(new Cleaner(0).totalHourlyCost);

        Cleaner c1 = new Cleaner(12.99f);
        Cleaner c2 = new Cleaner(12.99f);
        System.out.println(c1.totalHourlyCost);
    }
}