package ComputerRepairShop;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop("Mr.Robot Service", "Computer repair shop", 1, "Blanchardstown Rd N, Blanchardstown, Dublin, D15 YV78");

        Customer customer1 = new Customer("Thomas", Service.BUY_A_SECOND_HAND_COMPUTER, "thomas.perisse@gmail.com", "06.18.90.15.62", 3200);
        Customer customer2 = new Customer("Ludovic", Service.BOOK_IN_LAPTOP_FOR_VIRUS_REMOVAL, "ludovic.apple@outlook.com", "06.45.89.10.10", 3);
        //Customer customer2 = new Customer("Ludovic", shop.services[2], "ludovic.apple@outlook.com", "06.45.89.10.10", 3);

        System.out.println(shop);
        shop.getService();

        System.out.println(customer1);
        System.out.println(customer2);

        shop.canBeOfService(customer1);
        shop.canBeOfService(customer2);
    }
}
