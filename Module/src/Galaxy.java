public class Galaxy extends Phone{

    private Boolean expandableMemory;

    public Galaxy(String make, String model, String os, String memory, Integer cameraMegapixels, Boolean expandableMemory) {
        super(make, model, os, memory, cameraMegapixels);
        this.expandableMemory = expandableMemory;
    }

    public Boolean getExpandableMemory() {
        return expandableMemory;
    }

    public void setExpandableMemory(Boolean expandableMemory) {
        this.expandableMemory = expandableMemory;
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "expandableMemory=" + expandableMemory +
                '}';
    }
}
