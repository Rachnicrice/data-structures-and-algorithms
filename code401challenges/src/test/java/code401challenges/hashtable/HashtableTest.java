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

    @Test
    public void testAdd_ExpectedCollision () {
        table.add("Sean", "my bf and bff");
        table.add("Saen", "some weirdo");

        assertEquals("some weirdo", table.get("Saen"));
        assertEquals("my bf and bff", table.get("Sean"));
    }

    @Test
    public void testHash () {
        assertTrue(table.hash("oihfieuge") < table.map.length);
    }
}
