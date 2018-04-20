package ru.training.multithreading;

//Демонстрация класса расиряющего класс Thread
public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");
        //Сначала создать объект типа MyThread
        MyThread2 mt = new MyThread2("Child #1");

        //Затем сформировать поток на основе этого объекта

        for(int i =0; i<50;i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException exc){
                System.out.println("Прерывание основного потока");
            }
        }
        System.out.println("Завершение основного потока");
    }
}
