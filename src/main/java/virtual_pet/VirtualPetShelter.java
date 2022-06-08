package virtual_pet;

import virtual_pet.VirtualPet;

import java.util.ArrayList;

public class VirtualPetShelter {

    private ArrayList<VirtualPet> shelter;

    public VirtualPetShelter() {
        shelter = new ArrayList<>();
        VirtualPet pet1 = new VirtualPet("kalu", 1, 3, 4);
        VirtualPet pet2 = new VirtualPet("tommy", 3, 6, 2);
        VirtualPet pet3 = new VirtualPet("rati", 4, 5, 3);
        VirtualPet pet4 = new VirtualPet("sate", 3, 4, 2);

        shelter.add(pet1);
        shelter.add(pet2);
        shelter.add(pet3);
        shelter.add(pet4);

    }

    public int findSize() {
        return shelter.size();
    }
    public void feedAll(int portionsOfFood) {
        for (VirtualPet pet : shelter) {
            pet.feedPet(portionsOfFood);
        }
    }

    public void drinkWaterAll(int ozOfWater){
        for (VirtualPet pet : shelter) {
            pet.drinkWater(ozOfWater);
        }
    }

    public void playGamesAll() {
        for (VirtualPet pet : shelter) {
            pet.playGame();
        }

    }

    public void feedOne( VirtualPet pet, int portionsOfFood ) {
        pet.feedPet(portionsOfFood);
    }

    public VirtualPet getOnePet(int num) {
        return shelter.get(num);
    }
    public VirtualPet getOnePetwithName(String name) {
        int temp = 0;
        for(int i = 0; i < shelter.size(); i++) {
            if(shelter.get(i).getName().equals(name)) {
                temp = i;
            }
        }
        return getOnePet(temp);
    }

    public void drinkWaterOne(VirtualPet pet, int ozOfWater) {
        pet.drinkWater( ozOfWater);

    }

    public void playGameOne(VirtualPet pet) {
        pet.playGame();

    }
    public void tick(){
        for(VirtualPet pet: shelter){
            pet.tick();
        }

    }
    public void admitPet(VirtualPet addPet ) {
        shelter.add(addPet);

    }

    public void adoptPet(VirtualPet adoptPet) {
        shelter.remove(adoptPet);

    }









}

