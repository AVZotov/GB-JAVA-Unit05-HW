package ru.geekbrains.api.Seminar005.HW.Exercise001;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Россия, идет вперед, всей планеты. Планета — это не Россия.";
        String[] textArray = text.replaceAll("[^а-яА-Я ]", "").
                replace("  ", " ").toLowerCase().split(" ");
        var result = getMap(textArray);
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println("word = " + entry.getKey() + " count = " + entry.getValue());
        }
    }

    /**
     *
     * @param stringArray String array of words
     * @return Map with counts per each word in array
     * @apiNote Get count of word's repeats in String Array
     */
    private static Map<String, Integer> getMap(String[] stringArray) {
        Map<String, Integer> integerMap = new HashMap<>();

        for (String s : stringArray) {
            integerMap.putIfAbsent(s, 0);
            integerMap.put(s, integerMap.get(s) + 1);
        }
        return integerMap;
    }
}
