package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if(sentence.isEmpty())
            return new HashMap<>();

        Map<String, Integer> hMap = new HashMap<>();
        String words = sentence.toLowerCase(Locale.ROOT);
        String[] tokens = words.split("[ \\.,]+");
        System.out.println(words);

        for (String item : tokens) {
            if (hMap.containsKey(item)) {
                hMap.put(item, hMap.get(item) + 1);
            } else {
                hMap.put(item, 1);
            }
        }
        return hMap;
    }
}
