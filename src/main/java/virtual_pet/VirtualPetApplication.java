package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet pets = new VirtualPet("kalu", 4, 3, 4);
        pets.greeting();
        boolean play = true;
        String exit = "e";


        while (pets.getHungerLevel() != 5 && pets.getThristLevel() != 5 && pets.getHungerLevel() != 5 && play){

            pets.choose();
            String choose = input.nextLine();
            choose = choose.toLowerCase();
            System.out.println();

            if (choose.equals("e")) {
                play = false;

            } else if (choose.equals("f")) {
                System.out.println("1 portion = -1 hunger level");
                System.out.println("your hungerLevel is " + pets.getHungerLevel());
                System.out.println(("enter the number portion of food:"));
                int portionOfFood = input.nextInt();
                input.nextLine();
                pets.feedPet(portionOfFood);
                System.out.println();
                System.out.println("your current hungerLevel is " + pets.getHungerLevel());

            } else if (choose.equals("w")) {
                System.out.println("1 oz = -1 thrist level");
                System.out.println("your thristLevel is " + pets.getThristLevel());
                System.out.println("enter the oz of water to drink:");
                String water = "w";
                int ozOfWater = input.nextInt();
                input.nextLine();
                pets.drinkWater(ozOfWater);
                System.out.println();
                System.out.println("your current thristLevel is " + pets.getHungerLevel());

            } else if (choose.equals("pg")) {
                System.out.println(" game = - boredom level");
                System.out.println("your boredomLevel is " + pets.getBoredomLevel());
                System.out.println(("enter pg to play game:"));
                String playSoccer = input.nextLine();
                pets.playGame();
                System.out.println();
                System.out.println("your current boredomLevel is " + pets.getHungerLevel());

            }


             pets.tick();






        }

    }
}
