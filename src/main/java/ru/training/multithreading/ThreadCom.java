package ru.training.multithreading;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread4 mt1 = new MyThread4("Tick", tt);
        MyThread4 mt2 = new MyThread4("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Прерывание основного потока");
        }
    }
}
