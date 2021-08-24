package code401challenges.hashtable;

import code401challenges.hastable.HashEntry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashEntryTest {
    HashEntry entry;

    @Before
    public void setUp () {
        entry = new HashEntry("I'm a key", "I'm a value");
    }

    @Test
    public void testHashEntryConstructor () {
        assertEquals("I'm a key", entry.key);
        assertEquals("I'm a value", entry.value);
        assertNull(entry.next);
    }
}
