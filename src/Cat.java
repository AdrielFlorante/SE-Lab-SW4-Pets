public class Cat implements Pet {
    private String petName;

    public Cat(String petName) {
        this.petName = petName;
    }

    @Override
    public String makeSound() {
        return "Meow, Meow.";
    }

    @Override
    public String eat() {
        return "Fish and meat";
    }

    @Override
    public String getName() {
        return petName;
    }
}
