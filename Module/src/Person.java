public class Person {

    public Integer id;
    public Boolean fullTime;

    public Person(Integer id, Boolean fullTime) {
        this.id = id;
        this.fullTime = fullTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getFullTime() {
        return fullTime;
    }

    public void setFullTime(Boolean fullTime) {
        this.fullTime = fullTime;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullTime=" + fullTime +
                '}';
    }
}
