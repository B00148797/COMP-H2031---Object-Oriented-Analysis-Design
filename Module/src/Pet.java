public class Pet {

    public String name;
    public String type;
    public Integer age = 5;

    public Pet() {

    }

    public Pet(String name, String type, Integer age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() { //(PET) <name> is a <type>, and is <age> years old.
        return "(PET) " + name + " is a " + type + ", and is " + age + " years old.";
    }

}
