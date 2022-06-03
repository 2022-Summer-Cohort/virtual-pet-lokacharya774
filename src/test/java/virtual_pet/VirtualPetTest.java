package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void shouldReturnHungerLevelWhenWhenFeed() {
        VirtualPet underTest = new VirtualPet("kalu", 3, 3, 4);
        underTest.feedPet(1);
        assertEquals(2, underTest.getHungerLevel());


    }

    @Test
    public void shouldReturnThristLevelWhenDrinkWater() {
        VirtualPet underTest = new VirtualPet("kalu", 2, 3, 6);
        underTest.drinkWater(1);
        assertEquals(2, underTest.getThristLevel());
    }

    @Test
    public void shouldReturnBoredomLevelWhenPlayGame() {
        VirtualPet underTest = new VirtualPet("kalu", 4, 7, 1);
        underTest.playGame();
        assertEquals(1, underTest.getBoredomLevel());


    }

}
