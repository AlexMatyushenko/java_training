package ru.training.sort_array;

// Быстрая сортировка массива (быстрый алгоритм Хоара)
public class QuickSort {
    static void sort(int nums[]) {
        quicksort(nums, 0, nums.length - 1);
    }

    private static void quicksort(int nums[], int left, int right) {
        int top, bottom;
        int comparand, value;

        // первая позиция
        top = left;
        // последняя позиция
        bottom = right;
        // выбор компаранда(символ из середины массива)
        comparand = nums[((left + right) / 2)];

        //разделение последовательности на две части
        do {
            while ((nums[top] < comparand) && (top < right))
                top++;
            while ((comparand < nums[bottom]) && (bottom > left))
                bottom--;
            if (top <= bottom) {
                value = nums[top];
                nums[top] = nums[bottom];
                nums[bottom] = value;
                top++;
                bottom--;
            }
        } while (top <= bottom);

        // рекурсивная сортировка первой части
        if (left < bottom)
            quicksort(nums, left, bottom);
        // рекурсивная сортировка второй части
        if (top < right)
            quicksort(nums, top, right);
    }
}
