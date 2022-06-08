package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

     @Test
     public void shouldReturnHungerLevelWhenFeedPet() {
          VirtualPetShelter underTest = new VirtualPetShelter();
          VirtualPet pet1 = new VirtualPet("kalu", 1, 3, 4);
          VirtualPet pet2 = new VirtualPet("tommy", 3, 6, 2);
          VirtualPet pet3 = new VirtualPet("rati", 4, 5, 3);
          VirtualPet pet4 = new VirtualPet("sate", 3, 4, 2);
          underTest.admitPet(pet1);
          underTest.admitPet(pet2);
          underTest.admitPet(pet3);
          underTest.admitPet(pet4);

          underTest.feedOne(underTest.getOnePet(0),1);
          assertEquals(0,underTest.getOnePet(0).getHungerLevel());
     }

     @Test
     public void shouldReturnThirstLevelWhenGivenWater() {
          VirtualPetShelter underTest = new VirtualPetShelter();
          VirtualPet pet1 = new VirtualPet("kalu", 1, 3, 4);
          VirtualPet pet2 = new VirtualPet("tommy", 3, 6, 2);
          VirtualPet pet3 = new VirtualPet("rati", 4, 5, 3);
          VirtualPet pet4 = new VirtualPet("sate", 3, 4, 2);
          underTest.admitPet(pet1);
          underTest.admitPet(pet2);
          underTest.admitPet(pet3);
          underTest.admitPet(pet4);

          underTest.drinkWaterOne(underTest.getOnePet(2),2);
          assertEquals(3,underTest.getOnePet(2).getThristLevel());

     }
          @Test
     public void shouldReturnBoredomLevelWhenPlayGame() {
               VirtualPetShelter underTest = new VirtualPetShelter();
               VirtualPet pet1 = new VirtualPet("kalu", 1, 3, 4);
               VirtualPet pet2 = new VirtualPet("tommy", 3, 6, 2);
               VirtualPet pet3 = new VirtualPet("rati", 4, 5, 3);
               VirtualPet pet4 = new VirtualPet("sate", 3, 4, 2);
               underTest.admitPet(pet1);
               underTest.admitPet(pet2);
               underTest.admitPet(pet3);
               underTest.admitPet(pet4);

               underTest.playGameOne(underTest.getOnePet(3));
               assertEquals(1,underTest.getOnePet(3).getBoredomLevel());
     }
          @Test
     public void shouldReturnHungerLevelWhenFeedAllPet(){
               VirtualPetShelter underTest = new VirtualPetShelter();
               VirtualPet pet1 = new VirtualPet("kalu", 1, 3, 4);
               VirtualPet pet2 = new VirtualPet("tommy", 3, 6, 2);
               VirtualPet pet3 = new VirtualPet("rati", 4, 5, 3);
               VirtualPet pet4 = new VirtualPet("sate", 3, 4, 2);
               underTest.admitPet(pet1);
               underTest.admitPet(pet2);
               underTest.admitPet(pet3);
               underTest.admitPet(pet4);


               underTest.feedAll(1);
               assertEquals(0,underTest.getOnePet(0).getHungerLevel());
               assertEquals(2,underTest.getOnePet(1).getHungerLevel());
               assertEquals(3,underTest.getOnePet(2).getHungerLevel());
               assertEquals(2,underTest.getOnePet(3).getHungerLevel());
     }

          @Test
     public void shouldReturnThristLevelWhenGivenWaterAllPet(){
               VirtualPetShelter underTest = new VirtualPetShelter();
               VirtualPet pet1 = new VirtualPet("kalu", 1, 3, 4);
               VirtualPet pet2 = new VirtualPet("tommy", 3, 6, 2);
               VirtualPet pet3 = new VirtualPet("rati", 4, 5, 3);
               VirtualPet pet4 = new VirtualPet("sate", 3, 4, 2);
               underTest.admitPet(pet1);
               underTest.admitPet(pet2);
               underTest.admitPet(pet3);
               underTest.admitPet(pet4);

               underTest.drinkWaterAll(3);
               assertEquals(0,underTest.getOnePet(0).getThristLevel());
               assertEquals(3,underTest.getOnePet(1).getThristLevel());
               assertEquals(2,underTest.getOnePet(2).getThristLevel());
               assertEquals(1,underTest.getOnePet(3).getThristLevel());


          }

          @Test
     public void shouldReturnBoredomLevelWhenPlayGamesAllPet(){
               VirtualPetShelter underTest = new VirtualPetShelter();
               VirtualPet pet1 = new VirtualPet("kalu", 1, 3, 4);
               VirtualPet pet2 = new VirtualPet("tommy", 3, 6, 2);
               VirtualPet pet3 = new VirtualPet("rati", 4, 5, 3);
               VirtualPet pet4 = new VirtualPet("sate", 3, 4, 2);
               underTest.admitPet(pet1);
               underTest.admitPet(pet2);
               underTest.admitPet(pet3);
               underTest.admitPet(pet4);

               underTest.playGamesAll();
               assertEquals(1,underTest.getOnePet(0).getBoredomLevel());
               assertEquals(1,underTest.getOnePet(1).getBoredomLevel());
               assertEquals(1,underTest.getOnePet(2).getBoredomLevel());
               assertEquals(1,underTest.getOnePet(3).getBoredomLevel());




          }




}


