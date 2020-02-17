package code401challenges.hastable;

public class HashEntry {
    //instance variables
    String key;
    String value;
    HashEntry next;

    //constructor
    public HashEntry (String key, String value) {
        this.key = key;
        this.value = value;
    }
}
