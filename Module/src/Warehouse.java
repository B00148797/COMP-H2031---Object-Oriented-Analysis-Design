public class Warehouse extends Building{
    private String mainGoodsType;

    public Warehouse(String address, Integer sizeMetersSquared, String mainGoodsType) {
        super(address, sizeMetersSquared);
        this.mainGoodsType = mainGoodsType;
    }

    public String getMainGoodsType() {
        return mainGoodsType;
    }

    public void setMainGoodsType(String mainGoodsType) {
        this.mainGoodsType = mainGoodsType;
    }
}
