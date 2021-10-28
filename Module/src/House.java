public class House extends Building{
    private  Integer numBedrooms;
    private Integer numBathrooms;

    public House(String address, Integer sizeMetersSquared, Integer numBedrooms, Integer numBathrooms) {
        super(address, sizeMetersSquared);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }

    public Integer getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(Integer numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public Integer getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(Integer numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    @Override
    public String toString() {
        return "(HOUSE) address = " + getAddress() + " / size = " + getSizeMetersSquared() + " sq.m. / " + getNumBedrooms() + " bedrooms / " + getNumBathrooms() + " bathrooms";
    }
}
