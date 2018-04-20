package ru.training.multithreading;

public class Sync {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        MyThread3 mt1 = new MyThread3("Child #1", a);
        MyThread3 mt2 = new MyThread3("Child #2",a );
    }
}
