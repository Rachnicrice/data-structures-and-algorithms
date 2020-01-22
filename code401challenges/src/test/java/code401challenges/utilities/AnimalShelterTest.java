package code401challenges.utilities;

import code401challenges.utilities.AnimalShelter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class AnimalShelterTest {
    AnimalShelter emptyShelter;
    AnimalShelter fullShelter;

    @Before
    public void setUp () {
        emptyShelter = new AnimalShelter();

        fullShelter = new AnimalShelter();
        fullShelter.enqueue("cat");
        fullShelter.enqueue("dog");
        fullShelter.enqueue("dog");
        fullShelter.enqueue("cat");
        fullShelter.enqueue("dog");
    }

    @Test
    public void testAnimalShelterConstructor () {
        Assert.assertEquals(null, emptyShelter.oldest);
        Assert.assertEquals(null, emptyShelter.newest);
    }

    @Test
    public void testEnqueue_AddOneAnimal () {
        emptyShelter.enqueue("dog");

        Assert.assertEquals("dog", emptyShelter.oldest.animal);
        Assert.assertEquals("dog", emptyShelter.newest.animal);
        Assert.assertEquals(null, emptyShelter.oldest.next);
    }

    @Test
    public void testEnqueue_AddManyAnimals () {
        Assert.assertEquals("cat", fullShelter.oldest.animal);
        Assert.assertEquals("dog", fullShelter.newest.animal);

        Assert.assertEquals("dog", fullShelter.oldest.next.animal);
        Assert.assertEquals("dog", fullShelter.oldest.next.next.animal);
        Assert.assertEquals("cat", fullShelter.oldest.next.next.next.animal);
    }

    @Test (expected = NoSuchElementException.class)
    public void testDequeue_EmptyQueue () {
        Assert.assertEquals(null, emptyShelter.dequeue("cat"));
    }

    @Test (expected = NoSuchElementException.class)
    public void testDequeue_AnimalNotDogOrCat () {
        Assert.assertEquals(null, fullShelter.dequeue("wombat"));
    }

    @Test
    public void testDequeue_WantedAnimalAtFront () {
        Assert.assertEquals("cat", fullShelter.dequeue("cat"));
    }

    @Test
    public void testDequeue_WantedAnimalNotAtFront () {
        Assert.assertEquals("dog", fullShelter.dequeue("dog"));
    }

    @Test
    public void testDequeue_AllAnimalsFromShelterOutOfOrder () {
        Assert.assertEquals("cat", fullShelter.dequeue("cat"));
        Assert.assertEquals("cat", fullShelter.dequeue("cat"));

        Assert.assertEquals("dog", fullShelter.dequeue("dog"));
        Assert.assertEquals("dog", fullShelter.dequeue("dog"));
        Assert.assertEquals("dog", fullShelter.dequeue("dog"));

        Assert.assertEquals(null, fullShelter.oldest);
        Assert.assertEquals(null, fullShelter.newest);
    }

    @Test
    public void testDequeue_AllAnimalsFromShelterInOrder () {
        Assert.assertEquals("cat", fullShelter.dequeue("cat"));
        Assert.assertEquals("dog", fullShelter.dequeue("dog"));

        Assert.assertEquals("dog", fullShelter.dequeue("dog"));
        Assert.assertEquals("cat", fullShelter.dequeue("cat"));
        Assert.assertEquals("dog", fullShelter.dequeue("dog"));

        Assert.assertEquals(null, fullShelter.oldest);
        Assert.assertEquals(null, fullShelter.newest);
    }

}
