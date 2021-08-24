package code401challenges.TreeIntersection;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.HashSet;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    Tree t1;
    Tree t2;
    Node node;
    HashSet<Integer> set;

    @Before
    public void setUp () {
        set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(8);

        t1 = new Tree (node = new Node(1));
        t1.root.left = new Node(5);
        t1.root.right = new Node(2);
        t1.root.left.right = new Node(8);

        t2 = new Tree (node = new Node(1));
        t2.root.left = new Node(5);
        t2.root.right = new Node(2);
        t2.root.left.right = new Node(8);
    }

    @Test
    public void testTreeIntersection_AllMatchingValues () {
        assertArrayEquals(set.toArray(), TreeIntersection.tree_intersection(t1, t2).toArray());
    }

    @Test
    public void testTreeIntersection_EmptyTrees () {
        assertTrue(TreeIntersection.tree_intersection(new Tree(), new Tree()).isEmpty());
    }

    @Test
    public void testTreeIntersection_DifferingValues () {
        t1.root.left.right.left = new Node(15);
        t1.root.left.right.right = new Node(20);

        assertArrayEquals(set.toArray(), TreeIntersection.tree_intersection(t1, t2).toArray());
    }
}
