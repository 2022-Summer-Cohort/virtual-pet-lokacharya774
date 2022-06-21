package VirtualPetAmok;

import VirtualPet.VirtualPet;

public abstract class robotics extends VirtualPet {

    protected int oilLevel;
    protected int maintenanceLevel;
    protected int responseTime;


    public robotics(String name, int oilLevel, int maintenanceLevel, int responseTime) {
        super(name);
        this.oilLevel = oilLevel;
        this.maintenanceLevel = maintenanceLevel;
        this.responseTime = responseTime;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public int getResponseTime() {
        return responseTime;
    }

    public void giveOil() {
        oilLevel-=2;
    }

    public void giveMaintenance() {
        maintenanceLevel-=2;
    }

    public void checkResponse() {
        responseTime-=2;
    }

    public void roboticTick() {
        oilLevel+=2;
        maintenanceLevel+=2;
        responseTime+=2;
    }

}
