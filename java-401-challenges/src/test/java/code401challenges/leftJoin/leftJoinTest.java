package code401challenges.leftJoin;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class leftJoinTest {
    HashMap<String, String> syn;
    HashMap<String, String> ant;
    HashMap<String, String> expected;

    @Before
    public void setUp () {
        syn = new HashMap<>();
        syn.put("cool", "rad");

        ant = new HashMap<>();
        ant.put("cool", "lame");

        expected = new HashMap<>();
        expected.put("cool", "rad, lame");
    }

    @Test
    public void testLeftJoin_AllMatchingKeys () {
        assertEquals(expected, LeftJoin.leftJoin(syn, ant));
    }

    @Test
    public void testLeftJoin_FewMatchingKeys () {
        syn.put("apple", "fruit");
        ant.put("broccoli", "delicious");
        expected.put("apple", "fruit, null");

        assertEquals(expected, LeftJoin.leftJoin(syn, ant));
    }

    @Test
    public void testLeftJoin_NoMatchingKeys () {
        ant.clear();
        expected.clear();
        expected.put("cool", "rad, null");

        assertEquals(expected, LeftJoin.leftJoin(syn, ant));
    }

}
