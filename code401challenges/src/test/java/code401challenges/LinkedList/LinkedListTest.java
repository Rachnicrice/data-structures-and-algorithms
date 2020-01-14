package code401challenges.LinkedList;

import org.junit.Assert;
import org.junit.Test;

import java.util.NoSuchElementException;

public class LinkedListTest {

    @Test
    public void testCanInstantiateList () {
        LinkedList testList = new LinkedList();

        Assert.assertEquals(null, testList.head);
    }

    @Test
    public void testInsertOneValue () {
        LinkedList testList = new LinkedList();
        testList.insert("b");

        Assert.assertEquals("b", testList.head.value);
    }

    @Test
    public void testInsertMultipleValues () {
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

    @Test
    public void testIncludesValueFound () {
        LinkedList testList = new LinkedList();
        testList.insert("b");
        testList.insert("c");
        testList.insert("a");

        Assert.assertEquals(true, testList.includes("a"));

    }

    @Test
    public void testIncludesValueNotFound () {
        LinkedList testList = new LinkedList();
        testList.insert("b");
        testList.insert("c");
        testList.insert("a");

        Assert.assertEquals(false, testList.includes("z"));
    }

    @Test
    public void testIncludesMultipleSameValues () {
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

    @Test
    public void testToStringFewValues () {
        LinkedList testList = new LinkedList();
        testList.insert("z");
        testList.insert("w");
        testList.insert("x");

        String expected =
                "{x} -> {w} -> {z} -> NULL";

        Assert.assertEquals(expected, testList.toString());
    }

    @Test
    public void testToStringNoValues () {
        LinkedList testList = new LinkedList();

        Assert.assertEquals("NULL", testList.toString());
    }

    @Test
    public void testAppendOneValue () {
        LinkedList testList = new LinkedList();
        testList.append("b");

        Assert.assertEquals("b", testList.head.value);
    }

    @Test
    public void testAppendMultipleValues () {
        LinkedList testList = new LinkedList();
        testList.append("l");
        testList.append("e");
        testList.append("a");
        testList.append("h");
        testList.append("c");
        testList.append("a");
        testList.append("R");

        Assert.assertEquals("l", testList.head.value);
    }

    @Test
    public void testInsertBefore_ValueInList () {
        LinkedList testList = new LinkedList();
        testList.insert("a");
        testList.insert("c");
        testList.insertBefore("c", "b");

        Assert.assertEquals("b", testList.head.next.value);
    }

    @Test
    public void testInsertBefore_FirstValue () {
        LinkedList testList = new LinkedList();
        testList.insert("a");
        testList.insert("c");
        testList.insertBefore("c", "b");

        Assert.assertEquals("b", testList.head.value);
    }

    @Test (expected = NoSuchElementException.class)
    //This test will fail and throw the NoSuchElementException
    public void testInsertBefore_ValueNotInList () {
        LinkedList testList = new LinkedList();
        testList.insert("a");
        testList.insert("c");
        testList.insertBefore("z", "b");

        Assert.assertEquals("c", testList.head.next.value);
    }

    @Test
    public void testInsertAfter_ValueInList () {
        LinkedList testList = new LinkedList();
        testList.append("a");
        testList.append("c");
        testList.insertAfter("a", "b");

        Assert.assertEquals("b", testList.head.next.value);
    }

    @Test (expected = NoSuchElementException.class)
    public void testInsertAfter_ValueNotInList () {
        LinkedList testList = new LinkedList();
        testList.insert("a");
        testList.insert("c");
        testList.insertAfter("z", "b");

        Assert.assertEquals("c", testList.head.next.value);
    }

    @Test
    public void testInsertAfter_LastValue () {
        LinkedList testList = new LinkedList();
        testList.append("a");
        testList.append("c");
        testList.insertAfter("c", "b");

        Assert.assertEquals("b", testList.head.next.next.value);
    }
}
