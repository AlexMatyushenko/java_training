package ru.training.multithreading;

public class MyThread implements Runnable {
    Thread thrd;

    //Создать новый поток
    MyThread(String name) {
        thrd = new Thread(this,name);
        thrd.start(); //запустить поток
    }
    //Точка входа в поток
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + thrd.getName() + ", счетчик:" + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - завершение");
    }
}