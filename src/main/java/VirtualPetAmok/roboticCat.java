package VirtualPetAmok;

public class roboticCat extends robotics implements play {


    public roboticCat(String name, int oilLevel, int maintenanceLevel, int responseTime) {
        super(name, oilLevel, maintenanceLevel, responseTime);
    }

    @Override
    public void play() {
        oilLevel += 2;
        maintenanceLevel += 2;
        responseTime -= 2;
    }
}


