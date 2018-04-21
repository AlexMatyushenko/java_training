package ru.training.multithreading;

class MyThread4 implements Runnable {
    Thread thrd;
    TickTock ttOb;

    //Создать новый поток
    MyThread4(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start();//запустить поток
    }

    //Начать выполнение нового потока
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++)
                ttOb.tick(true);
            ttOb.tick(false);
        } else {
            for (int i = 0; i < 5; i++)
                ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}
