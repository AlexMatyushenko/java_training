package ru.training.sort_array;

public class QuickSortDemo {
    public static void main(String[] args) {
        int nums[] = {2, 5, 8, 34, 9, 5, 0, 6, 4, 7, 9, 3, 4};
        ShowArray.show(nums, "Изначальный массив:");
        QuickSort.sort(nums);
        ShowArray.show(nums, "Отсортированный массив");
    }
}
