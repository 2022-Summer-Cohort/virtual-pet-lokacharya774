package VirtualPetAmok;

import java.util.Scanner;
public class VirtualPetAmokApplication {

    public static void main(String[] args) {

        VirtualPetAmokShelter shelter = new VirtualPetAmokShelter();
        Scanner input = new Scanner(System.in);

        VirtualPet cat1 = new organicCat("lucy",10,10,10,10);
        VirtualPet cat2 = new roboticCat("luna",10,10,10);
        VirtualPet dog1 = new organicDog("abe",10,10,10,10);
        VirtualPet dog2 = new roboticDog("abby",10,10,10);

        shelter.admitToShelter(cat1);
        shelter.admitToShelter(cat2);
        shelter.admitToShelter(dog1);
        shelter.admitToShelter(dog2);

        System.out.println("Hello and welcome to Virtual Pet Amok Game");
        System.out.println();
        shelter.showPetStatus();
        System.out.println();
        String choose = "";


        while (!choose.equals("e") && shelter.findSize()!=0) {
            System.out.println("What would you like to do? ");
            System.out.println("Give Oil (O): ");
            System.out.println("Give Maintenance (M): ");
            System.out.println("Clean Cage (C): ");
            System.out.println("Give Food (F): ");
            System.out.println("Give Water (W): ");
            System.out.println("Walk all dogs (WD): ");
            System.out.println("Play all cats (PC): ");
            System.out.println("Exit the game: ");
            System.out.println("adopt pet (a): ");
            System.out.println("admit pet (b): ");
            choose = input.nextLine();
            choose = choose.toLowerCase();
            if (choose.equals("o")) {
                System.out.println("You've chosen to give oil to the robotic pets!!");
                shelter.giveOilForAllRobotics();
                shelter.tickForAllOrganics();

            } else if (choose.equals("m")) {
                System.out.println("You've chosen to do maintenance to the robotic pets!!");
                shelter.maintenanceForAllRobotics();
                shelter.tickForAllOrganics();

            } else if(choose.equals("c")) {
                System.out.println("You've chosen to clean cage of all organic pets!!");
                shelter.cageCleanForAllOrganics();
                shelter.tickForAllRobotics();

            } else if(choose.equals("f")) {
                System.out.println("You've chosen to give food to all organic pets!!");
                shelter.hungerLevelForAllOrganics();
                shelter.tickForAllRobotics();

            } else if(choose.equals("w")) {
                System.out.println("You've chosen to give water to all organic pets!!");
                shelter.thirstLevelForAllOrganics();
                shelter.tickForAllRobotics();

            } else if(choose.equals("wd")) {
                System.out.println("You've chosen to walk all the dogs!!");
                shelter.walkAllDogs();
                shelter.tickForAllOrganics();
                shelter.tickForAllRobotics();

            } else if(choose.equals("pc")) {
                System.out.println("You've chosen to play with all cats!!");
                shelter.playAllCats();
                shelter.tickForAllOrganics();
                shelter.tickForAllRobotics();

            } else if (choose.equals("a")) {
                System.out.println("which pet would you like to adopt ?");
                for (int i = 0; i < shelter.findSize(); i++) {
                    System.out.print(shelter.getOnePet(i).getName() + " ");
                }
                choose = input.nextLine();
                choose = choose.toLowerCase();
                shelter.adoptPet(shelter.getOnePetWithName(choose));
                System.out.println();

            }else if (choose.equals("b")) {
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

                VirtualPet admitPet = new organicDog(newPetName,5,5,5,5) {
                };
                shelter.admitPet(admitPet);
                System.out.println();


            } else {
                choose = "e";
            }
            System.out.println();
            shelter.showPetStatus();
            System.out.println();
        }
        System.out.println("Thank you for playing the game!!!");

    }


}
