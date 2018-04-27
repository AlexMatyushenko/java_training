package ru.training.strings;

//Класс реализует метод, который заменяет часть строки
public class StringReplace {
    static String replace(String original, String pattern, String replace) {
        int pos = 0;
        int start = 0;
        StringBuffer result = new StringBuffer();

        //Пока в тексте есть часть строки, которую нужно заменить
        while ((pos = original.indexOf(pattern, start)) >= 0) {
            result.append(original.substring(start, pos));
            result.append(replace);
            start = pos + pattern.length();
        }
        result.append(original.substring(start));
        return result.toString();
    }
}
