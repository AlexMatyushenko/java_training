package ru.training.strings;

public class StringReplaceDemo {
    public static void main(String[] args) {
        String original = "ПриветМирПриветМир";
        String pattern = "Мир";
        String replace = "Все";
        String result = StringReplace.replace(original,pattern,replace);
        System.out.println(result);
    }
}

