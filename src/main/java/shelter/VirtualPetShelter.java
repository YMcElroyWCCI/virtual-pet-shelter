package shelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    public Map<String, VirtualPet> allPets = new HashMap<>();
    private String name;


    public void add(VirtualPet myPet) {
        allPets.put(myPet.getName(), myPet);
    }

    public String findPetInShelter(String petName) {
        return petName;
    }

    public void addPetToTheShelter(VirtualPet myPet) {
        String newPetNameToAdd = myPet.getName();
        allPets.put(newPetNameToAdd, myPet);
    }


    public void feedAllPets() {
        for (VirtualPet pet : allPets.values()) {
            pet.feed();
        }
    }

    public void waterAllPets() {
        for (VirtualPet pet : allPets.values()) {
            pet.water();
        }
    }

    public void removeAPetFromTheShelter(VirtualPet myPet) {
        allPets.remove(VirtualPet.getPetName(), myPet);
    }


    public String returnAPetName() {
        return name;
    }

    public String optionForPlayAndAdopt() {
        String optionForPlay = "";
        for (Map.Entry<String, VirtualPet> eachPet : allPets.entrySet()) {
            optionForPlay += eachPet.getValue().getName() + "\t" + eachPet.getValue().getDescription() + "\n";
        }
        return optionForPlay;
    }

    public boolean doesPetRemain(String name) {
        return allPets.containsKey(name);
    }

    public void adopt(String myPet) {
        allPets.remove(myPet);
    }

    public void tickAll() {
        for (VirtualPet pet : allPets.values()) {
            pet.tick();
        }
    }

    public String petStatus() {
        String petStatus = "";
        for (Map.Entry<String, VirtualPet> eachPet : allPets.entrySet()) {
            petStatus += eachPet.getValue().getName() + "    \t" + eachPet.getValue().getCurrentHunger() + "    \t" + eachPet.getValue().getCurrentThirst() + "    \t" + eachPet.getValue().getCurrentBore() + "\n";
        }
        return petStatus;


    }
}
