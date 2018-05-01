package ru.training.sort_array;

// Вывод массива на консоль
public class ShowArray {
    static void show(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\n");
    }
}
