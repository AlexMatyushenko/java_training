package ru.training.multithreading;

public class MyThread3 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    //создать новый поток
    MyThread3(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();//запустить поток
    }

    //Начать выполнение нового потока
    public void run() {
        int sum;
        System.out.println(thrd.getName() + " - запуск");

        answer = sa.sumArray(a);
        System.out.println("СУММА для " + thrd.getName() + ": " + answer);

        System.out.println(thrd.getName() + " - завершение");
    }

}
