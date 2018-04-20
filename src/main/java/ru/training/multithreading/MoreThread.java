package ru.training.multithreading;

//Ожидание завершения дочерних потоков
public class MoreThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");
        //Сначала создать объект типа MyThread
        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");

        //Затем сформировать поток на основе этого объекта

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        } while (mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt2.thrd.isAlive());
        System.out.println("Завершение основного потока");
    }
}