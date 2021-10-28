package ComputerRepairShop;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Shop {
    private String name;
    private String activity;
    private Integer numberEmploy = 1;
    private String theHeadOffice;
    public Service[] services = Service.values();

    public Shop(String name, String activity, Integer numberEmploy, String theHeadOffice) {
        this.name = name;
        this.activity = activity;
        this.numberEmploy = numberEmploy;
        this.theHeadOffice = theHeadOffice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Integer getNumberEmploy() {
        return numberEmploy;
    }

    public void setNumberEmploy(Integer numberEmploy) {
        this.numberEmploy = numberEmploy;
    }

    public String getTheHeadOffice() {
        return theHeadOffice;
    }

    public void setTheHeadOffice(String theHeadOffice) {
        this.theHeadOffice = theHeadOffice;
    }

    @Override
    public String toString() {
        return "\u001B[34m" + "Shop" + "\u001B[0m" + "{" +
                "name='" + name + '\'' +
                ", activity='" + activity + '\'' +
                ", numberEmploy=" + numberEmploy +
                ", theHeadOffice='" + theHeadOffice + '\'' +
                '}';
    }

    public void canBeOfService(Customer customer){
        if (customer.getMoney() >= customer.getServiceNeed().getPriceService()){
            System.out.println("\u001B[32m" + customer.getName() + " can pay for the service." + "\u001B[0m");
        }
        else
        {
            System.out.println("\u001B[31m" + customer.getName() + " cannot pay for the service." + "\u001B[0m");
        }
    }

    public void getService(){
        System.out.println("There are " + services.length + " services: ");
        if (services.length > 0){
            for (int i = 0 ; i < services.length ; i++){
                System.out.println(i+1 + "\t" + services[i].name() + " - " + "\u001B[33m" + services[i].getPriceService() + "€" + "\u001B[0m");
            }
        }
    }
}
