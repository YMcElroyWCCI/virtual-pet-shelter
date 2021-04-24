package shelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter allPets = new VirtualPetShelter();

        VirtualPet virtualPet1 = new VirtualPet("Simba", "is a calm bulldog but loves to toot and smell like candy", 25, 30, 50);
        VirtualPet virtualPet2 = new VirtualPet("Fred", "is a cute border collie but shed a lot", 15, 10, 40);
        VirtualPet virtualPet3 = new VirtualPet("Luna", "is a sporting weimaraner loves to run", 20, 20, 35);
        VirtualPet virtualPet4 = new VirtualPet("Slayer", "is a man's best friend famously known as the chick magnet pomeranian doll", 10, 10, 10);

        allPets.add(virtualPet1);
        allPets.add(virtualPet2);
        allPets.add(virtualPet3);
        allPets.add(virtualPet4);

        System.out.println("\nThank you for visiting \033[32mThe Lovely Greenville VirtualPet Shelter\n \033[0m");
        System.out.println("This is the status of the VirtualPets\n");
        System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
        System.out.println("------\t|------\t|------\t|------");
        System.out.println(allPets.petStatus());
        System.out.println("What would you like to do next?\n");
        System.out.println("1. Feed the pets");
        System.out.println("2. Water the pets");
        System.out.println("3. Play with a pet");
        System.out.println("4. Adopt a pet");
        System.out.println("5. Admit a pet");
        System.out.println("6. Quit");
        String userChoice = input.nextLine();

        while (!userChoice.equals("6")) {
            if (userChoice.equals("1")) {
                System.out.println("You want to feed all pets");
                allPets.feedAllPets();
                System.out.println("All pets current status");
                System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
                System.out.println("------\t|------\t|------\t|------");
                System.out.println(allPets.petStatus());
            } else if (userChoice.equals("2")) {
                System.out.println("You want to water all pets");
                allPets.waterAllPets();
                System.out.println("All pets current status");
                System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
                System.out.println("------\t|------\t|------\t|------");
                System.out.println(allPets.petStatus());
            } else if (userChoice.equals("3")) {
                System.out.println("Which dog would you like to play with?\n");
                System.out.println(allPets.optionForPlayAndAdopt());
                String petName = input.nextLine();
                allPets.optionForPlayAndAdopt();
                System.out.println(petName + " is happy for playing outside");
            } else if (userChoice.equals("4")) {
                System.out.println("You are adopting a pet");
                System.out.println("Which pet would you like to adopt?\n");
                System.out.println(allPets.optionForPlayAndAdopt());
                String petName = input.nextLine();

                if (!allPets.doesPetRemain(petName)) {
                    System.out.println("There is no pet under that name");
                } else {
                    allPets.adopt(petName);
                    System.out.println("You have successfully adopted a pet");
                    System.out.println("All pets current status");
                    System.out.println("Name\t|Hunger\t|Thirst\t|Boredom");
                    System.out.println("------\t|------\t|------\t|------");
                    System.out.println(allPets.petStatus());
                }
            } else if (userChoice.equals("5")) {
                System.out.println("Admit a pet");
                System.out.println("Enter the name of the newPet");
                String newPetName = input.nextLine();
                System.out.println("Enter the description of the newPet");
                String newPetDescription = input.nextLine();
                allPets.add(new VirtualPet(newPetName, newPetDescription));
            } else {
                System.out.println("I'm sorry I don't understand");
            }
            allPets.tickAll();
            System.out.println("What would you like to do next?\n");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. Quit");

            userChoice = input.nextLine();
        }
        System.out.println("Thanks for visiting \033[32mThe Lovely Greenville VirtualPet Shelter\n \033[0m");
        input.close();
    }

}



