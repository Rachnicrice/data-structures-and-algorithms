package code401challenges.hastable;

public class Hashtable {
    //instance variables
    int size;
    String[] map;

    //constructor function
    public Hashtable (int size) {
        this.size = size;
        this.map = new String[size];
    }


    //instance methods
    public void add (String key, String value) {
        int idx = hash(key);
        if (!this.contains(key)){

        } else {

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
