public class Dog implements Pet {
    private String petName;

    public Dog(String petName) {
        this.petName = petName;
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }

    @Override
    public String eat() {
        return "Meat and bones"; // A dog eats meat and bones
    }

    @Override
    public String getName() {
        return petName;
    }
}
