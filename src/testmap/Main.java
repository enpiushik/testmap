package testmap;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map <String, String> translations = new TreeMap<>(Comparator.reverseOrder());
        // HashMap - выводит список рандомно
        // LinkedHashMap - сохраняет порядок, как в списке
        // HashMap - выводит список без порядка
        // TreeMap - вывод список в алафавитном порядке/в порядке возрастания/и т.д.
        // new TreeMap<>(Comparator.reverseOrder()) - выводит список в обратном отсартированом/алвафитном порядке

        // key, value - ключ, значение
        translations.put("two", "два");
        translations.put("one", "один");
        translations.put("home", "дом");
        translations.put("mouse", "мышь");


        System.out.println(translations.get("home"));

        for (String k : translations.keySet()) {
            System.out.printf("%s -> %s\n", k, translations.get(k));
            // %s - выводит строку
            // \n - переносит на след. строку

        }
    }
}
