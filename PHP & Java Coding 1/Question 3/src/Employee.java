public class Employee {
    protected String name;
    private Integer staffNumber = 1;
    private Boolean fullTime;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getStaffNumber() {
        return staffNumber;
    }

    public Boolean getFullTime() {
        return fullTime;
    }

    public void setStaffNumber(Integer staffNumber) {
        this.staffNumber = staffNumber;
    }

    public void setFullTime(Boolean fullTime) {
        this.fullTime = fullTime;
    }
}