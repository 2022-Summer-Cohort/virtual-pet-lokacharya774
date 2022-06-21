package VirtualPetAmok;

import VirtualPet.VirtualPet;

import java.util.Scanner;

public class VirtualPetAmok {

    public static void main(String[] args) {

        VirtualPetAmokShelter shelter = new VirtualPetAmokShelter();
        Scanner input = new Scanner(System.in);

        VirtualPet cat1 = new organicCat("cat",10,10,10,10);
        VirtualPet cat2 = new roboticCat("cat2",10,10,10);
        VirtualPet dog1 = new organicDog("dog",10,10,10,10);
        VirtualPet dog2 = new roboticDog("dog2",10,10,10);

        shelter.admitToShelter(cat1);
        shelter.admitToShelter(cat2);
        shelter.admitToShelter(dog1);
        shelter.admitToShelter(dog2);

        System.out.println("Hello and welcome to Virtual Pet Amok Game");
        System.out.println();
        shelter.showPetStatus();
        System.out.println();
        String choose = "";


        while (!choose.equals("e") && shelter.shelterSize()!=0) {
            System.out.println("What would you like to do? ");
            System.out.println("Give Oil (O): ");
            System.out.println("Give Maintenance (M): ");
            System.out.println("Clean Cage (C): ");
            System.out.println("Give Food (F): ");
            System.out.println("Give Water (W): ");
            System.out.println("Walk all dogs (WD): ");
            System.out.println("Play all cats (PC): ");
            System.out.println("Exit the game: ");
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
