package shelter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class VirtualPetTest {
    VirtualPet virtualPet;
    int startingCurrentHunger;
    int startingCurrentThirst;
    int startingCurrentBore;

    @BeforeEach
    public void setUp() {
        virtualPet = new VirtualPet("Luna", "smells like a lavender flower");
        startingCurrentHunger = virtualPet.getCurrentHunger();
        startingCurrentThirst = virtualPet.getCurrentThirst();
        startingCurrentBore = virtualPet.getCurrentBore();
    }

    @Test
    public void constructorShouldTakeNameAndDescription() {
        assertEquals(virtualPet.getName(), "Luna");
        assertEquals(virtualPet.getDescription(), "smells like a lavender flower");
    }


    @Test
    public void shouldReturnCurrentHungerLevel() {
        virtualPet.feed();
        assertTrue(startingCurrentHunger < virtualPet.getCurrentHunger());
    }

    @Test
    public void shouldReturnCurrentThirstLevel() {
        virtualPet.water();
        assertTrue(startingCurrentThirst < virtualPet.getCurrentThirst());
    }

    @Test
    public void shouldReturnCurrentBoreLevel() {
        virtualPet.bore();
        assertTrue(startingCurrentBore < virtualPet.getCurrentBore());
    }


}
