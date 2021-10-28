public class Main {
    
    public static void main(String[] args) {

        MainDish mainDish = new MainDish("Boiled Egg", 260);
        mainDish.setNeedsHeating(true);
        mainDish.diet = DietType.VEGETARIAN;

        System.out.println(mainDish);
        System.out.println("Number of MainDish objects = " + mainDish.getTotalMainDishes());
    }
}