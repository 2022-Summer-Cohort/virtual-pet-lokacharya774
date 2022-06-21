package VirtualPet;

public abstract class VirtualPet {

    protected String name;

    public VirtualPet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}