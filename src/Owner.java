import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String ownerName;
    private List<Pet> pets; // To store multiple pets

    public Owner(String ownerName) {
        this.ownerName = ownerName;
        this.pets = new ArrayList<>();
    }

    public void getPets() {
        System.out.println(ownerName + " has the following pets:");
        for (Pet pet : pets) {
            System.out.print(" " + pet.getName());
            System.out.println(" says " + pet.makeSound()); // All pets make a sound
        }
    }

    public void addPet(Pet pet) {
        pets.add(pet); // So the owner can have multiple pets in the pets list
    }
}
