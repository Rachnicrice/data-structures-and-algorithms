package code401challenges.hastable;

import java.util.NoSuchElementException;

public class Hashtable {
    //instance variables
    int size;
    HashEntry[] map;

    //constructor function
    public Hashtable (int size) {
        this.size = size;
        this.map = new HashEntry[size];
    }


    //instance methods
    public void add (String key, String value) {
        int idx = hash(key);
        HashEntry hashEntry = new HashEntry(key, value);

        if (map[idx] == null){
            map[idx] = hashEntry;
        } else {
            HashEntry current = map[idx];
            while (current.next != null) {
                current = current.next;
            }
            current.next = hashEntry;
        }
    }

    public String get (String key) {
        int idx = hash(key);

        if (map[idx] != null) {
            HashEntry current = map[idx];

            while (!current.key.equals(key) && current.next != null){
                current = current.next;
            }

            if (current.key.equals(key)) {
                return current.value;
            } else {
                throw new NoSuchElementException("That's not in the hashtable!");
            }

        } else {
            throw new NoSuchElementException("That's not in the hashtable!");
        }
    }

    public Boolean contains (String key) {
        int idx = hash(key);

        return false;
    }

    public int hash (String key) {
        return key.hashCode() % this.size;
    }


}
