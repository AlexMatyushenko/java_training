package ru.training.sort_array;

//Сортировка массива слиянием
public class MergeSort {

    public void sort(int A[], int p, int r) {
        int q;
        if (p < r) {
            q = (p + r) / 2;
            sort(A, p, q);
            sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    private void merge(int A[], int p, int q, int r) {
        // текущая позиция чтения из первой последовательности
        int pos1 = p;
        // текущая позиция чтения из второй последовательности
        int pos2 = q + 1;
        // текущая позиция записи в temp
        int posTemp = 0;
        // временный буфер
        int temp[] = new int[r - p + 1];

        // идет слияние, пока есть хоть один элемент в каждой последовательности
        while (pos1 <= q && pos2 <= r) {
            if (A[pos1] < A[pos2])
                temp[posTemp++] = A[pos1++];
            else
                temp[posTemp++] = A[pos2++];
        }

        // если одна последовательность закончилась, то копируется остаток другой в конец буфера
        while (pos1 <= q)  // пока первая последовательность непуста
            temp[posTemp++] = A[pos1++];
        while (pos2 <= r)   // пока вторая последовательность непуста
            temp[posTemp++] = A[pos2++];

        // скопировать буфер temp в массив a[]
        for (int i = 0; i < r - p + 1; i++)
            A[p + i] = temp[i];
    }
}
