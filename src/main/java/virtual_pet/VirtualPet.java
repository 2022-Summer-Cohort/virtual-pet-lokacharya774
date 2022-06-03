package virtual_pet;

public class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thristLevel;
    private int boredomLevel;
    private int feed;

    public VirtualPet(String name, int hungerLevel, int thristLevel, int boredomLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thristLevel = thristLevel;
        this.boredomLevel = boredomLevel;

    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThristLevel() {
        return thristLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public void setHungerLevel() {
        System.out.println();
    }
    public void greeting() {
        System.out.println("this VirtualPet's name is " + name + ",my hungerLevel is " +
                hungerLevel + ",my thristLevel is "  + thristLevel + ", my boredomLevel is " + boredomLevel );

    }
    public void choose() {
        System.out.println("what do you want to do");

    }


    public void feedPet(int portionOfFood) {
       hungerLevel-= portionOfFood;


    }

    public void drinkWater(int ozOfWater) {
        thristLevel-= ozOfWater;

    }

    public void playGame() {
        boredomLevel = 1;

    }
    public void tick(){
        boredomLevel--;
        hungerLevel--;
        thristLevel--;

    }


}
