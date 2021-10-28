public class Phone {
    private String make = "Apple";
    private String model;
    private String os = "iOS";
    private String memory;
    private Integer cameraMegapixels;

    public Phone(String make, String model, String os, String memory, Integer cameraMegapixels) {
        this.make = make;
        this.model = model;
        this.os = os;
        this.memory = memory;
        this.cameraMegapixels = cameraMegapixels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Integer getCameraMegapixels() {
        return cameraMegapixels;
    }

    public void setCameraMegapixels(Integer cameraMegapixels) {
        this.cameraMegapixels = cameraMegapixels;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", os='" + os + '\'' +
                ", memory='" + memory + '\'' +
                ", cameraMegapixels=" + cameraMegapixels +
                '}';
    }
}
