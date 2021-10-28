public class Dessert {

    public enum DietType{
        VEGAN, VEGETARIAN, CARNIVORE
    }

    public String name;
    public DietType diet;

    public Dessert() {
    }

    public Dessert(String name, DietType diet) {
        this.name = name;
        this.diet = diet;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "name='" + name + '\'' +
                ", diet=" + diet +
                '}';
    }
}
