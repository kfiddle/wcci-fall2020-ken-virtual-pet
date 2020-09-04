import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

public class VirtualPetTest {

    VirtualPet testPet = new VirtualPet();


    @Test
    public void testIftheBasicFeedingPetWorks() {

        testPet.feed(5);
        Assert.assertEquals(25, testPet.getHunger());
        Assert.assertEquals(25, testPet.getVigilance());
    }

    @Test
    public void letsGiveDryFoodByCallingFeedMethod() {

        testPet.feedDryFood(3);
        Assert.assertEquals(27, testPet.getHunger());
        Assert.assertEquals(31, testPet.getVigilance());
    }

    @Test
    public void sameTestButWithWetFood() {

        testPet.feedWetFood(3);
        Assert.assertEquals(21, testPet.getHunger());
        Assert.assertEquals(13, testPet.getVigilance());
    }

    @Test
    public void sameTestButWithTreat() {

        testPet.feedTreat();
        Assert.assertEquals(28, testPet.getHunger());
        Assert.assertEquals(19, testPet.getVigilance());
        Assert.assertEquals(12, testPet.getFatigue());

    }

    @Test
    public void testThePettingMethod() {

        testPet.stroke();
        Assert.assertEquals(5, testPet.getVigilance());

    }

    @Test
    public void testingDrinkWater() {
        testPet.drink();
        Assert.assertEquals(10, testPet.getThirst());
    }

    // the two hunting method tests

    @Test
    public void testMouseOrBirdHunting() {
        testPet.setAge(2);
        testPet.hunt();
        Assert.assertEquals(28, testPet.getHunger());
    }

    @Test
    public void testPetToy() {
        testPet.setAge(3);
        testPet.play();
        Assert.assertEquals(15, testPet.getVigilance());
    }



    }






