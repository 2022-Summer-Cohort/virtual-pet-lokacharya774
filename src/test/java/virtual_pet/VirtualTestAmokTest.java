package virtual_pet;


import VirtualPetAmok.VirtualPet;
import VirtualPetAmok.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class VirtualTestAmokTest {
    VirtualPetAmokShelter underTest;

    @BeforeEach
    public void initializeValue(){
        underTest = new VirtualPetAmokShelter();
        VirtualPet cat1 = new organicCat("cat",8,10,5,4);
        VirtualPet cat2 = new roboticCat("cat2",10,10,10);
        VirtualPet dog1 = new organicDog("dog",7,3,4,6);
        VirtualPet dog2 = new roboticDog("dog2",4,4,8);

        underTest.admitToShelter(cat1);
        underTest.admitToShelter(cat2);
        underTest.admitToShelter(dog1);
        underTest.admitToShelter(dog2);
    }

    @Test
    public void cleanCageForAllOrganicPets() {
        underTest.cageCleanForAllOrganics();
        assertEquals(6,((organicCat)underTest.getOnePet(0)).getCageCleanLevel());
        assertEquals(5,((organicDog)underTest.getOnePet(2)).getCageCleanLevel());
    }

    @Test
    public void oilLevelForAllRoboticsPets() {
        underTest.giveOilForAllRobotics();
        assertEquals(8,((roboticCat)underTest.getOnePet(1)).getOilLevel());
        assertEquals(2,((roboticDog)underTest.getOnePet(3)).getOilLevel());
    }

    @Test
    public void happinessAndResponseTimeForEachPets(){
        underTest.happinessLevelForAllOrganics();
        underTest.responseTimeForAllRobotics();

        assertEquals(8,((organicCat)underTest.getOnePet(0)).getHappinessLevel());
        assertEquals(1,((organicDog)underTest.getOnePet(2)).getHappinessLevel());

        assertEquals(8,((roboticCat)underTest.getOnePet(1)).getResponseTime());
        assertEquals(6,((roboticDog)underTest.getOnePet(3)).getResponseTime());

    }

}
