package ru.training.sort_array;

// Пузырьковая сортировка массива
public class BubbleSort {
    static void sort(int nums[]) {
        // вспомогательная переменная
        int t;

        for (int a = 1; a < nums.length; a++) {
            // повтор для каждого элемента массива
            for (int b = nums.length - 1; b >= a; b--) {
                // повтор для проверкиорядка соседних элементов
                if (nums[b - 1] > nums[b]) {
                    // перестановка элементов
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }
    }
}
