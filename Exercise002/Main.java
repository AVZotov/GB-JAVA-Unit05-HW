package ru.geekbrains.api.Seminar005.HW.Exercise002;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputString = "Иван Иванов\n" +
                "Светлана Петрова\n" +
                "Кристина Белова\n" +
                "Анна Мусина\n" +
                "Анна Крутова\n" +
                "Иван Юрин\n" +
                "Петр Лыков\n" +
                "Павел Чернов\n" +
                "Петр Чернышов\n" +
                "Мария Федорова\n" +
                "Марина Светлова\n" +
                "Мария Савина\n" +
                "Мария Рыкова\n" +
                "Марина Лугова\n" +
                "Анна Владимирова\n" +
                "Иван Мечников\n" +
                "Петр Петин\n" +
                "Иван Ежов";
        String[] names = inputString.split("\n");
        var namesMap = getWordsCount(names);
        printMapInDescendingOrder(namesMap);
    }

    /**
     *
     * @param namesMap a collection with firstNames and number of repeats as values
     * @apiNote Printing the collection of names and the number of repeats sorted by values in descending order
     */
    private static void printMapInDescendingOrder(TreeMap<String, Integer> namesMap) {
        List<Map.Entry<String, Integer>> sortedList =
                namesMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();
        System.out.println(sortedList);
    }

    /**
     *
     * @param names String array of First + Second names
     * @return TreeMap which contains first names only with count of repeats
     * @apiNote write program to find duplicate names and count number of repeats
     */
    private static TreeMap<String, Integer> getWordsCount(String[] names) {
        TreeMap<String, Integer> integerMap = new TreeMap<>();
        for (String name : names) {
            String[] temp = name.split(" ");
            String firstName = temp[0];
            integerMap.putIfAbsent(firstName, 0);
            integerMap.put(firstName, integerMap.get(firstName) + 1);
        }
        return integerMap;
    }
}
