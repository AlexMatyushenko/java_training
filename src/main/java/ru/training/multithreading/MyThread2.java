package ru.training.multithreading;

// Расширение класса Thread
public class MyThread2 extends Thread {

    //Создать новый поток
    MyThread2(String name) {
        super(name); // присвоить имя потока
        start(); //запустить поток
    }
    //Точка входа в поток
    public void run() {
        System.out.println(getName() + " - запуск");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() + ", счетчик:" + count);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " - прерван");
        }
        System.out.println(getName() + " - завершение");
    }
}