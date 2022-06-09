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

        while (play && shelter.findSize() > 0 ) {
            System.out.println();
            System.out.println("please choose what you want to work with");
            System.out.println("One = one, All = all, adoptPet = a, admitPet = b, or exit = e");
            String oneOrAll = input.nextLine();
            oneOrAll = oneOrAll.toLowerCase();

            if (oneOrAll.equals("e")) {
                System.out.println("Goodbye!");
                System.out.println("Thank you for playing this game");
                System.out.println();
                play = false;

            } else if (oneOrAll.equals("one")) {

                System.out.println("what do you want to do to onePet");
                System.out.println("Feed = F, Water = W, Play Game = PG, exit = e, adoptPet = a, admitPet = b");
                String choose = input.nextLine();
                choose = choose.toLowerCase();
                System.out.println();

                System.out.println("Which pet you want to select? ");
                String petName = input.nextLine();
                petName = petName.toLowerCase();
                VirtualPet tempPet = shelter.getOnePetwithName(petName);

                if (choose.equals("f")) {
                    System.out.println("how many portionOfFood you want to feed");
                    int portionOfFood = input.nextInt();
                    tempPet.feedPet(portionOfFood);

                } else if (choose.equals("w")) {
                    System.out.println("how many oz of water you want to give");
                    int ozOfWater = input.nextInt();
                    tempPet.drinkWater(ozOfWater);

                } else if (choose.equals("pg")) {
                    tempPet.playGame();
                }


            } else if (oneOrAll.equals("all")) {
                System.out.println("what do you want to do to allPet");
                System.out.println("Feed = F, Water = W, Play Game = PG, exit = e");
                String choose = input.nextLine();
                choose = choose.toLowerCase();
                System.out.println();

                if (choose.equals("f")) {
                    System.out.println("how many portions of food you want to feedAll");
                    int portionsOfFoodToAll = input.nextInt();
                    input.nextLine();
                    shelter.feedAll(portionsOfFoodToAll);

                } else if (choose.equals("W")) {
                    System.out.println("how many oz of water do you want to give");
                    int ozOfWater = input.nextInt();
                    input.nextLine();
                    shelter.drinkWaterAll(ozOfWater);

                } else if (choose.equals("pg")) {
                    shelter.playGamesAll();
                }

            } else if (oneOrAll.equals("a")) {
                System.out.println("which pet you want to adopt");

                for (int i = 0; i < shelter.findSize(); i++) {
                    System.out.print(shelter.getOnePet(i).getName() + " ");
                }


                String choose = input.nextLine();
                choose = choose.toLowerCase();
                shelter.adoptPet(shelter.getOnePetwithName(choose));
                System.out.println();


            } else if (oneOrAll.equals("b")) {
                System.out.println("what is your pet name ?");
                String newPetName = input.nextLine();

                System.out.println("what is your pet hungerLevel ?");
                int newPetHugerLevel = input.nextInt();
                input.nextLine();

                System.out.println("what is your pet thristLevel ?");
                int newPetThristLevel = input.nextInt();
                input.nextLine();

                System.out.println("what is your pet boredomLevel ?");
                int newPetBoredomLevel = input.nextInt();
                input.nextLine();

                VirtualPet admitPet = new VirtualPet(newPetName, newPetHugerLevel, newPetThristLevel, newPetBoredomLevel);
                shelter.admitPet(admitPet);
                System.out.println();

            }
            for (int i = 0; i < shelter.findSize(); i++) {
                shelter.getOnePet(i).showStatus();
            }
        }
        shelter.tick();


    }
}


