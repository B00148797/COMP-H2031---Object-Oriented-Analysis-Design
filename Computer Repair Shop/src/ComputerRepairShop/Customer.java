package ComputerRepairShop;

public class Customer {
    private String name;
    private Service serviceNeed;
    private String mailAddress;
    private String phoneNumber;
    private Integer money;

    public Customer(String name, Service serviceNeed, String mailAddress, String phoneNumber, Integer money) {
        this.name = name;
        this.serviceNeed = serviceNeed;
        this.mailAddress = mailAddress;
        this.phoneNumber = phoneNumber;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Service getServiceNeed() {
        return serviceNeed;
    }

    public void setServiceNeed(Service serviceNeed) {
        this.serviceNeed = serviceNeed;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "\u001B[34m" + "Customer" + "\u001B[0m" + "{" +
                "name='" + name + '\'' +
                ", serviceNeed=" + serviceNeed.name() + " " + serviceNeed.getPriceService() + "€" +
                ", mailAddress='" + mailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", money=" + money +
                '}';
    }
}
