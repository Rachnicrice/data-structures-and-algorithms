package code401challenges.hastable;

public class HashEntry {
    //instance variables
    public String key;
    public String value;
    public HashEntry next;

    //constructor
    public HashEntry (String key, String value) {
        this.key = key;
        this.value = value;
    }
}
