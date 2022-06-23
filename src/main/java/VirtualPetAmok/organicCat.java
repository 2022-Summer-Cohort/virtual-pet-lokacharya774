package VirtualPetAmok;

public class organicCat extends organic implements play{

    public organicCat(String name, int cageCleanLevel, int happinessLevel, int hungerLevel, int thirstLevel) {
        super(name, cageCleanLevel, happinessLevel, hungerLevel, thirstLevel);
    }


    @Override
    public void play() {
        happinessLevel-=2;
        cageCleanLevel-=2;
        hungerLevel+=2;
        thirstLevel+=2;
    }
}
