package code401challenges.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class TreeTest {
    Tree testEmpty;
    Tree testFull;
    Node node;

    @Before
    public void setUp () {
        testEmpty = new Tree();
        testFull = new Tree (node = new Node (1));
        testFull.root.left = new Node(5);
        testFull.root.right = new Node(2);
        testFull.root.left.right = new Node(8);
    }

    //          1
    //         / \
    //        5   2
    //        \
    //          8
    // Pre = [1, 5, 8, 2]
    // In = [5, 8, 1, 2]
    // Post = [8, 5, 2, 1]

    @Test
    public void testTreeConstructor_EmptyTree () {
        Assert.assertEquals(null, testEmpty.root);
    }

    @Test
    public void testTreeConstructor_WithRootNode () {
        Assert.assertEquals(1, testFull.root.value);
    }

    @Test
    public void testPreOrder () {
        Integer[] expected = {1, 5, 8, 2};
        Integer[] actual = testFull.preOrder();
        Assert.assertArrayEquals(expected, testFull.preOrder());
    }

    @Test
    public void testInOrder () {
        Integer[] expected = {5, 8, 1, 2};
        Integer[] actual = testFull.inOrder();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testPostOrder () {
        Integer[] expected = {8, 5, 2, 1};
        Integer[] actual = testFull.postOrder();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testBreadthFirst_EmptyTree () {
        LinkedList<Integer> expected = new LinkedList<>();
        Assert.assertEquals(expected, testEmpty.breadthFirst());
    }

    @Test
    public void testBreadthFirst_FullTree () {
        LinkedList<Integer> expected = new LinkedList<>();
        expected.addLast(1);
        expected.addLast(5);
        expected.addLast(2);
        expected.addLast(8);
        Assert.assertEquals(expected, testFull.breadthFirst());
    }

    @Test (expected = NoSuchElementException.class)
    public void testFindMaximumValue_EmptyTree () {
        Assert.assertNull(testEmpty.find_Maximum_Value());
    }
}
