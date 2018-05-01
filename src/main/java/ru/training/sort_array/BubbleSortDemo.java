package ru.training.sort_array;

// Демонстрация пузырьковой сортировки массива
public class BubbleSortDemo {
    public static void main(String[] args) {
        int nums[] = {3, 6, 23, 9, 6, 9, 0, 5, 7, 8, 1};
        ShowArray.show(nums, "Изначальный массив:");
        BubbleSort.sort(nums);
        ShowArray.show(nums, "Отсортированный массив");
    }
}
