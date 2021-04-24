package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    private VirtualPetTest underTest;
    private String name;
    private String description;


    @BeforeEach
    public void setUp() {
        underTest = new VirtualPetTest();
    }


    @Test
    public void shouldReturnAPetGivenName() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Luna", "is a loyal dog", 50, 50, 50);
        underTest.returnAPetName();
        String retrievedReturnAPetName = underTest.findPetInShelter("Luna");
        assertEquals(retrievedReturnAPetName, "Luna");
    }

    @Test
    public void shouldBeAbleToAddAPetToTheShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Luna", "A wonderful dog", 50, 50, 50);
        underTest.addPetToTheShelter(myPet);
        String petFound = underTest.findPetInShelter("Luna");
        assertEquals("Luna", petFound);
    }

    @Test
    public void shouldBeAbleToRemoveAPetFromTheShelterForAdoption() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Luna", "A wonderful dog", 50, 50, 50);
        underTest.addPetToTheShelter(myPet);
        underTest.removeAPetFromTheShelter(myPet);
        String retrievedRemovedPet = underTest.findPetInShelter("Luna");
        assertEquals(retrievedRemovedPet, "Luna");
    }

    @Test
    public void shouldBeAbleToFeedAllPetsInTheShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Luna", "is a wonderful dog", 50, 50, 50);
        VirtualPet myPet2 = new VirtualPet("Simba", "is a quiet dog", 40, 40, 40);
        underTest.feedAllPets();
        int myPetHunger = myPet.getCurrentHunger();
        int myPet2Hunger = myPet2.getCurrentHunger();
        assertEquals(50, myPetHunger);
        assertEquals(40, myPet2Hunger);
    }

    @Test
    public void shouldBeAbleToWaterAllPetsInTheShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet myPet = new VirtualPet("Luna", "is a wonderful dog", 50, 50, 50);
        VirtualPet myPet2 = new VirtualPet("Simba", "is a quiet dog", 40, 40, 40);
        underTest.waterAllPets();
        int myPetThirsty = myPet.getCurrentThirst();
        int myPet2Thirsty = myPet2.getCurrentThirst();
        assertEquals(50, myPetThirsty);
        assertEquals(40, myPet2Thirsty);
    }


}
