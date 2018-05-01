package ru.training.sort_array;

//Демонтрация класса сортировки слиянием
public class MergeSortDemo {
    public static void main(String args[]) {
        int A[] = {5, 9, 4, 6, 1, 3, 2, 0};
        System.out.println("Изначальный массив:");
        ShowArray.show(A);
        MergeSort ms = new MergeSort();
        ms.sort(A, 0, A.length - 1);
        System.out.println("Отсортированный массив:");
        ShowArray.show(A);
    }
}

