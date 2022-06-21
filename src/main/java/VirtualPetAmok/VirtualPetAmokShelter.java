package VirtualPetAmok;

import java.util.ArrayList;

public class VirtualPetAmokShelter {

    private ArrayList<VirtualPet> shelter;

    public VirtualPetAmokShelter() {
        this.shelter = new ArrayList<>();
    }

    public void admitToShelter(VirtualPet temp) {
        shelter.add(temp);
    }

    public VirtualPet getOnePet(int num) {
        return shelter.get(num);
    }

    public VirtualPet getOnePetWithName(String name) {
        int temp = 0;
        for (int i = 0; i < shelter.size(); i++) {
            if (shelter.get(i).getName().equals(name)) {
                temp = i;
            }
        }
        return getOnePet(temp);
    }

    public void adoptFromShelter(String name) {
        shelter.remove(getOnePetWithName(name));
    }

    public void cageCleanForAllOrganics() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof organic) {
                ((organic) temp).cleanCage();
            }
        }
    }

    public void happinessLevelForAllOrganics() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof organic) {
                ((organic) temp).petsHappiness();

            }
        }
    }

    public void thirstLevelForAllOrganics() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof organic) {
                ((organic) temp).petsThirst();
            }
        }
    }

    public void hungerLevelForAllOrganics() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof organic) {
                ((organic) temp).petsHunger();
            }
        }
    }

    public void tickForAllOrganics() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof organic) {
                ((organic) temp).organicTick();
            }
        }
    }

    public void giveOilForAllRobotics() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof robotics) {
                ((robotics) temp).giveOil();
            }
        }
    }

    public void maintenanceForAllRobotics() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof robotics) {
                ((robotics) temp).giveMaintenance();
            }
        }
    }

    public void responseTimeForAllRobotics() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof robotics) {
                ((robotics) temp).checkResponse();
            }
        }
    }

    public void tickForAllRobotics() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof robotics) {
                ((robotics) temp).roboticTick();
            }
        }
    }

    public void walkAllDogs() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof organicDog || temp instanceof roboticDog) {
                ((Walking) temp).walking();
            }
        }
    }

    public void playAllCats() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof organicCat || temp instanceof roboticCat) {
                ((play) temp).play();
            }
        }
    }

    public void showPetStatus() {
        for (VirtualPet temp : shelter) {
            if (temp instanceof robotics) {
                System.out.println(temp.getName() + " = Oil: " + ((robotics) temp).getOilLevel() + " Maintenance: " +
                        ((robotics) temp).getMaintenanceLevel() + " Response: " + ((robotics) temp).getResponseTime());
            } else if(temp instanceof organic) {
                System.out.println(temp.getName() + " = Happiness: " + ((organic) temp).getHappinessLevel() + " CageClean: " +
                        ((organic) temp).getCageCleanLevel() + " Thirst: " + ((organic) temp).getThirstLevel() + "Hunger: " +
                        ((organic) temp).getHungerLevel());
            }
        }
    }

    public int shelterSize() {
        return shelter.size();
    }

}
