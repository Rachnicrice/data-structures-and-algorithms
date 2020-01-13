package code401challenges.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test public void testCanInstantiateList () {
        LinkedList testList = new LinkedList();

        Assert.assertEquals(null, testList.head);
    }

    @Test public void testInsertOneValue () {
        LinkedList testList = new LinkedList();
        testList.insert("b");

        Assert.assertEquals("b", testList.head.value);
    }

    @Test public void testInsertMultipleValues () {
        LinkedList testList = new LinkedList();
        testList.insert("l");
        testList.insert("e");
        testList.insert("a");
        testList.insert("h");
        testList.insert("c");
        testList.insert("a");
        testList.insert("R");

        Assert.assertEquals("r", testList.head.value);
    }

    @Test public void testIncludesValueFound () {
        LinkedList testList = new LinkedList();
        testList.insert("b");
        testList.insert("c");
        testList.insert("a");

        Assert.assertEquals(true, testList.includes("a"));

    }

    @Test public void testIncludesValueNotFound () {
        LinkedList testList = new LinkedList();
        testList.insert("b");
        testList.insert("c");
        testList.insert("a");

        Assert.assertEquals(false, testList.includes("z"));
    }

    @Test public void testIncludesMultipleSameValues () {
        LinkedList testList = new LinkedList();
        testList.insert("l");
        testList.insert("e");
        testList.insert("a");
        testList.insert("h");
        testList.insert("c");
        testList.insert("a");
        testList.insert("R");

        Assert.assertEquals(true, testList.includes("a"));
    }

    @Test public void testToStringFewValues () {
        LinkedList testList = new LinkedList();
        testList.insert("z");
        testList.insert("w");
        testList.insert("x");

        String expected =
                "{x} -> {w} -> {z} -> NULL";

        Assert.assertEquals(expected, testList.toString());
    }

    @Test public void testToStringNoValues () {
        LinkedList testList = new LinkedList();

        Assert.assertEquals("NULL", testList.toString());
    }
}
