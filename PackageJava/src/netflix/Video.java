package netflix;

public class Video {
    private Integer netflixId;
    private Integer contentCategory;

    public Video(Integer netflixId, Integer contentCategory) {
        this.netflixId = netflixId;
        this.contentCategory = contentCategory;
    }

    public Integer getNetflixId() {
        return netflixId;
    }

    public void setNetflixId(Integer netflixId) {
        this.netflixId = netflixId;
    }

    public Integer getContentCategory() {
        return contentCategory;
    }

    public void setContentCategory(Integer contentCategory) {
        this.contentCategory = contentCategory;
    }

    @Override
    public String toString() {
        return "Video{" +
                "netflixId=" + netflixId +
                ", contentCategory=" + contentCategory +
                '}';
    }
}