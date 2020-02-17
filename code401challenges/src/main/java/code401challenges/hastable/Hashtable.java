package code401challenges.hastable;

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

        return "";
    }

    public Boolean contains (String key) {
        int idx = hash(key);

        return false;
    }

    public int hash (String key) {
        return key.hashCode() % this.size;
    }


}
