package virtual_pet;

import virtual_pet.VirtualPet;

import java.util.Scanner;

public class VirtualPetShelterApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter shelter = new VirtualPetShelter();

        for (int i = 0; i < shelter.findSize(); i++) {
            shelter.getOnePet(i).greeting();
        }

        boolean play = true;
        String exit = "e";

        while (play) {
            System.out.println("One or All");
            String oneOrAll = input.nextLine();
            oneOrAll = oneOrAll.toLowerCase();

            if (oneOrAll.equals("e")) {
                System.out.println("Goodbye");
                play = false;

            } else if (oneOrAll.equals("one")) {

                System.out.println("what do you want to do");
                System.out.println("Feed = F, Water = W, Play Game = PG, exit = e");
                String choose = input.nextLine();
                choose = choose.toLowerCase();
                System.out.println();

                System.out.println("Which pet you want to select? ");
                String petName = input.nextLine();
                petName = petName.toLowerCase();
                VirtualPet tempPet = shelter.getOnePetwithName(petName);

                if (choose.equals("f")) {
                    tempPet.feedPet(1);
                } else if (choose.equals("w")){
                    tempPet.drinkWater(1);
                } else if (choose.equals("pg")) {
                    tempPet.playGame();
                }

            } else if (oneOrAll.equals("all")) {
                System.out.println("what do you want to do");
                System.out.println("Feed = F, Water = W, Play Game = PG, exit = e");
                String choose = input.nextLine();
                choose = choose.toLowerCase();
                System.out.println();

                if(choose.equals("f")) {
                    shelter.feedAll(1);
                } else if (choose.equals("W")){
                    shelter.drinkWaterAll(2);
                } else if (choose.equals("pg")){
                    shelter.playGamesAll();
                }

            } else if(oneOrAll.equals("adopt")){

            } else if (oneOrAll.equals("admit")) {

            }
            for (int i = 0; i < shelter.findSize(); i++) {
                shelter.getOnePet(i).showStatus();
            }
        }


    }
}


