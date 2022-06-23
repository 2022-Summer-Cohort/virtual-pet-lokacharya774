package VirtualPetAmok;

public abstract class organic extends VirtualPet {

    protected int cageCleanLevel;
    protected int happinessLevel;
    protected int hungerLevel;
    protected int thirstLevel;


    public organic(String name, int cageCleanLevel, int happinessLevel, int hungerLevel, int thirstLevel) {
        super(name);
        this.cageCleanLevel = cageCleanLevel;
        this.happinessLevel = happinessLevel;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
    }

    public int getCageCleanLevel() {
        return cageCleanLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public void cleanCage() {
        cageCleanLevel-=2;
    }

    public void petsHappiness() {
        happinessLevel-=2;
    }
    public void petsHunger() {
        hungerLevel-=2;
    }

    public void petsThirst() {
        thirstLevel-=2;
    }


    public void organicTick() {
        cageCleanLevel+=2;
        happinessLevel+=2;
        hungerLevel+=2;
        thirstLevel+=2;
    }
}
