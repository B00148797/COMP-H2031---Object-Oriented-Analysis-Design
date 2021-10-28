public class MainDish extends Dish{

    private Integer totalMainDishes = 0;

    public MainDish(String name, Integer calories) {
        super(name, calories);
        totalMainDishes++;
    }

    @Override
    public String toString() {
        return "(MAIN) " +
                this.name
                + " contains " + this.calories + " calories"
                + " (" + this.diet + ")";
    }

    public String getTotalMainDishes(){
        return totalMainDishes.toString();
    }
}