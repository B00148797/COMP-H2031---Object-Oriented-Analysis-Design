import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int numArgs = args.length;
        System.out.println("there were " + numArgs + " command line arguments");
        for (String s : args){
            System.out.println("argument: " + s);
        }

        if (numArgs >= 2){
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);
            System.out.println("width: " + width + " height: " + height);

            System.out.println(width + " + " + height + " = " + MyMaths.add(width, height));
        }

        Student student1 = new Student(99, "Matt", "Smith");

        Module module1 = new Module();
        System.out.println(module1);
        module1.title = "GUI Programming";
        System.out.println(module1);

        module1.setTitle("OOAD");
        System.out.println("Example of Year 2 module: " + module1.getTitle());

        Student s1 = new Student();
        s1.firstName = "Matt";
        s1.surname = "Smith";
        s1.gpa = 4;
        System.out.println(s1);


        BankAccount account = new BankAccount();
        account.balence = 1000;
        account.balence = -22;
        account.balence = 200000;
        account.balence = -1;

        Dog someDogObject = new Dog();
        System.out.println(someDogObject.getBreed());

        Car car1 = new Car(Color.BLUE);
        System.out.println(car1.getColor());

        Pet pet1 = new Pet("Gogu", "turtle", 34);
        pet1.setAge(100);
        System.out.println(pet1);
        Pet pet2 = new Pet("Lassie", "dog", 7);
        pet2.setName("Aristotle");
        System.out.println(pet2);

        Book book1 = new Book("The Restaurant at the end of the Universe", 9.99);
        System.out.println(book1);
        Book book2 = new Book("", -2.00);
        System.out.println(book2);

        Person person1 = new Person(12, false);
        System.out.println(person1);
        Person person2 = new Person(221, true);
        System.out.println(person2);

        //Food food1 = new Food("lettuce", true);
        //System.out.println(food1);

        Dessert pudding1 = new Dessert();
        pudding1.diet = Dessert.DietType.VEGETARIAN;
        pudding1.name = "Eton Mess";
        System.out.println(pudding1);

        Food food1 = new Food("lettuce", FreshType.FRESH);
        Food food2 = new Food("apple", FreshType.OUT_OF_DATE);
        System.out.println(food1);
        System.out.println(food2);

        Phone phone1 = new Iphone("Apple", "iPhone", "11", "64Gb", 12, true);
        Phone phone2 = new Galaxy("Samsung", "Galaxy Note", "55", "256Gb", 16, true);
        System.out.println(phone1);
        System.out.println(phone2);

        Building house1 = new House("24 Main Street", 2000, 3, 2);
        System.out.println(house1);

    }
}
