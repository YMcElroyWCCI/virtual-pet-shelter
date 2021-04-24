package shelter;

public class VirtualPet {
    private String name;
    private String description;
    private int currentHunger;
    private int currentThirst;
    private int currentBore;

    public VirtualPet(String name, String description, int currentHunger, int currentThirst, int currentBore) {
        this.name = name;
        this.description = description;
        this.currentHunger = currentHunger;
        this.currentThirst = currentThirst;
        this.currentBore = currentBore;
    }

    public VirtualPet(String name, String description) {
        this("Luna", "smells like a lavender flower", 20, 20, 20);
    }

    public static String getPetName() {
        return null;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCurrentHunger() {
        return currentHunger;
    }

    public int getCurrentThirst() {
        return currentThirst;
    }

    public int getCurrentBore() {
        return currentBore;
    }

    //tick() method
    public void tick() {
        currentHunger += 20;
        currentThirst += 20;
        currentBore += 20;
    }

    public void feed() {
        if (currentHunger <= 0) {
            currentHunger = 0;
        } else {
            currentHunger += 20;
        }
    }

    public void water() {
        if (currentThirst <= 0) {
            currentThirst = 0;
        } else {
            currentThirst += 20;
            currentBore -= 20;
        }
    }

    public void bore() {
        if (currentBore <= 0) {
            currentBore = 0;
        } else {
            currentBore += 30;
            currentHunger -= 60;
            currentThirst -= 60;
        }
    }


    public void playPet() {
        if (currentBore <= 0) {
            currentBore = 0;
        } else {
            currentBore += 10;
            currentHunger -= 10;
            currentThirst -= 10;
        }
    }
}


