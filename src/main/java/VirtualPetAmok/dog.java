package VirtualPetAmok;

public abstract class dog {
    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public dog(String name, String color) {
        this.name = name;
        this.color = color;

    }

}
