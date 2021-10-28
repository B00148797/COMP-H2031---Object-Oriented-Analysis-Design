public abstract class Building {
    protected String address;
    protected Integer sizeMetersSquared;

    public Building(String address, Integer sizeMetersSquared) {
        this.address = address;
        this.sizeMetersSquared = sizeMetersSquared;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSizeMetersSquared() {
        return sizeMetersSquared;
    }

    public void setSizeMetersSquared(Integer sizeMetersSquared) {
        this.sizeMetersSquared = sizeMetersSquared;
    }
}
