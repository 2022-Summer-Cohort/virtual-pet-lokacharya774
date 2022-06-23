package VirtualPetAmok;

public abstract class VirtualPet {

    protected String name;

    public VirtualPet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}