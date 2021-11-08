public class Cleaner extends Employee{
    private float hourlyRate = 0;
    public static float totalHourlyCost = 0;

    public Cleaner(float hourlyRate) {
        this.hourlyRate = hourlyRate;
        totalHourlyCost += hourlyRate;
    }
}