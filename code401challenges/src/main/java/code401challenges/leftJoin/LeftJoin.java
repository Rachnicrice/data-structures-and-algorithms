package code401challenges.leftJoin;

import java.util.HashMap;
import java.util.Map;

public class LeftJoin {
    public static HashMap<String, String> leftJoin (HashMap<String, String> syn, HashMap<String, String> ant) {
        HashMap<String, String> thesaurus = new HashMap<>();

        for (Map.Entry pair: syn.entrySet()) {
            String key = (String) pair.getKey();
            thesaurus.put(key, syn.get(key) + ", " + ant.get(key));
        }
        return thesaurus;
    }
}
