package ru.training.multithreading;

class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    //Создание нового потока
    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    //Начать выполнение нового потока
    public void run() {
        System.out.println(thrd.getName() + " - запуск");
        do {
            count++;

            if (currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("B " + currentName);
            }
        } while (stop == false && count < 10_000_000);
        stop = true;

        System.out.println("\n" + thrd.getName()+ "  - завершение");
    }
}
