public abstract class Dish {

    protected String name;
    protected Integer calories = 5;
    private Boolean needsHeating;
    public DietType diet;

    public Dish(String name, Integer calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public Integer getCalories() {
        return calories;
    }

    public Boolean getNeedsHeating() {
        return needsHeating;
    }

    public void setNeedsHeating(Boolean needsHeating) {
        this.needsHeating = needsHeating;
    }
}