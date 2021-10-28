package dubdevs;

public class Video {
    private String format;
    private Integer sizeMegabtyes;

    public Video(String format, Integer sizeMegabtyes) {
        this.format = format;
        this.sizeMegabtyes = sizeMegabtyes;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getSizeMegabtyes() {
        return sizeMegabtyes;
    }

    public void setSizeMegabtyes(Integer sizeMegabtyes) {
        this.sizeMegabtyes = sizeMegabtyes;
    }

    @Override
    public String toString() {
        return "Video{" +
                "format='" + format + '\'' +
                ", sizeMegabtyes=" + sizeMegabtyes +
                '}';
    }
}