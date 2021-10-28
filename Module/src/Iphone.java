public class Iphone extends Phone{

    private Boolean ios15Compatible;

    public Iphone(String make, String model, String os, String memory, Integer cameraMegapixels, Boolean ios15Compatible) {
        super(make, model, os, memory, cameraMegapixels);
        this.ios15Compatible = ios15Compatible;
    }

    public Boolean getIos15Compatible() {
        return ios15Compatible;
    }

    public void setIos15Compatible(Boolean ios15Compatible) {
        this.ios15Compatible = ios15Compatible;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "ios15Compatible=" + ios15Compatible +
                '}';
    }
}
