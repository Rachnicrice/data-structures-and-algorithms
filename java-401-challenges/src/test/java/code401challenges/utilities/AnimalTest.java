package code401challenges.utilities;

import code401challenges.utilities.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {
    Animal testDog;
    Animal testCat;

    @Before
    public void setUp () {
        testDog = new Animal("dog");
        testCat = new Animal("cat");
    }

    @Test
    public void testAnimalConstructor () {
        Assert.assertEquals("dog", testDog.animal);
        Assert.assertEquals("cat", testCat.animal);
    }

}
