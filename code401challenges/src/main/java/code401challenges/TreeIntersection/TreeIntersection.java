package code401challenges.TreeIntersection;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

import java.util.HashSet;

public class TreeIntersection {

    public static HashSet<Integer> tree_intersection(Tree tree1, Tree tree2){
        HashSet<Integer> HS = hashTree(tree1.root, new HashSet<Integer>());
        HashSet<Integer> matches = new HashSet<>();

        return findCommonValues(tree2.root, HS, matches);
    }

    public static HashSet<Integer> hashTree(Node node, HashSet<Integer> keys) {
        if (node != null) {
            keys.add(node.value);
            keys = hashTree(node.left, keys);
            keys = hashTree(node.right, keys);
        }
        return keys;
    }

    public static HashSet<Integer> findCommonValues(Node node, HashSet<Integer> keys, HashSet<Integer> matches){
        if (node != null) {
            if (keys.contains(node.value)){
                matches.add(node.value);
            }
            matches = findCommonValues(node.left, keys, matches);
            matches = findCommonValues(node.right, keys, matches);
        }
        return matches;
    }
}
