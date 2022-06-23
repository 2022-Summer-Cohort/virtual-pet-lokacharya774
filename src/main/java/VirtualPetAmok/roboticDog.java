package VirtualPetAmok;

public class roboticDog extends robotics implements Walking{


    public roboticDog(String name, int oilLevel, int maintenanceLevel, int responseTime) {
        super(name, oilLevel, maintenanceLevel, responseTime);
    }

    @Override
    public void walking() {
        oilLevel+=2;
        maintenanceLevel+=2;
        responseTime-=2;



    }

}
