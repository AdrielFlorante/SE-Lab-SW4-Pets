public class PetTest {
    public static void main(String[] args) {
        Pet andy = new Dog("Andy");
        Pet hachi = new Cat("Hachi");
        Owner owner = new Owner("Rune");

        owner.addPet(andy);
        owner.addPet(hachi);
        owner.getPets();
    }
}
