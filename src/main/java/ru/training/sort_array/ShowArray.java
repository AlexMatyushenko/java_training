package ru.training.sort_array;

// Вывод массива на консоль
public class ShowArray {
    // Вывести массив без текста
    static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    // Вывести массив с текстом
    static void show(int[] arr, String text) {
        System.out.println(text);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
