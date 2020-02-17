package code401challenges.hashtable;

import code401challenges.hastable.Hashtable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    Hashtable table;

    @Before
    public void setUp () {
        table = new Hashtable(16);
    }

    @Test
    public void testAdd_EmptyTable () {
        table.add("nutella", "is good");
        assertEquals("is good", table.get("nutella"));
    }

    @Test
    public void testGet_EmptyTable () {
        assertNull(table.get("nutella"));
    }

    @Test
    public void testGet_ValueExists () {
        table.add("heroo", "hello");
        assertEquals("hello", table.get("heroo"));
    }
    
}
