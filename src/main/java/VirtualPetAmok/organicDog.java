package VirtualPetAmok;

public class organicDog extends organic implements Walking{

    public organicDog(String name, int cageCleanLevel, int happinessLevel, int hungerLevel, int thirstLevel) {
        super(name, cageCleanLevel, happinessLevel, hungerLevel, thirstLevel);
    }

    @Override
    public void walking() {
        happinessLevel-=2;
        cageCleanLevel-=2;
        hungerLevel+=2;
        thirstLevel+=2;
    }


}
