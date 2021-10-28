package ComputerRepairShop;

public enum Service {
    BUY_A_SECOND_HAND_COMPUTER(700.0f),
    BOOK_IN_LAPTOP_FOR_VIRUS_REMOVAL(90.0f),
    DOWNLOAD_SOFTWARE_TO_PERFORM_AN_AUDIT(299.99f);

    private float price;

    private Service(float price) {
        this.price = price;
    }

    public float getPriceService() {
        return price;
    }

    @Override
    public String toString() {
        return "\u001B[33m" + "Service" + "\u001B[0m" + "{" +
                "price=" + price +
                '}';
    }
}
