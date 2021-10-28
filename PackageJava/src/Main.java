import netflix.Video;
import tudublin.Programme;
import tudublin.Student;

public class Main {
    public static void main(String[] args) {
        Programme hcert = new Programme("HCet Computing", 6);
        Student student1 = new Student("Joelle Murphy", hcert);
        System.out.println(student1);

        netflix.Video movie1 = new netflix.Video(202, 1024);
        dubdevs.Video file2020 = new dubdevs.Video("mp4", 404);

        System.out.println(movie1);
        System.out.println(file2020);
    }
}
