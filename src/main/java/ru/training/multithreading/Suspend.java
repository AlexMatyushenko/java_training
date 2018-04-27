package ru.training.multithreading;

public class Suspend {
    public static void main(String args[]){
        MyThread5 ob1 = new MyThread5("MyThread");

        try{
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Приостановка потока");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Возобновление потока");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Остановка потока");
            ob1.mystop();
        } catch (InterruptedException exc){
            System.out.println("Прерывание основного потока");
        }
        System.out.println("Выход из основного потока");
    }
}
