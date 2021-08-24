package code401challenges.RepeatedWord;

import java.util.HashSet;

public class RepeatedWord {

    public static String repeatedWord (String words) {
        HashSet<String> map = new HashSet<>();

        String[] array = words.split(" ");

        for (String word : array) {
            String realWord = word.split(",")[0];
            if (map.contains(realWord.toLowerCase())) {
                return word;
            }
            map.add(realWord.toLowerCase());
        }
        return "";
    }
}
