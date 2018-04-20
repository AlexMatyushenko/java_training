package ru.training.multithreading;

//использование ключевого слова synchronized для управления доступом
public class SumArray {
    private int sum;

    synchronized int sumArray(int nums[]){
        sum = 0; // обнулить сумму

        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            System.out.println("Текущее значение суммы ддя " + Thread.currentThread().getName() + ": " + sum);
            try{
                Thread.sleep(10);
            }catch (InterruptedException exc){
                System.out.println("Прерывание основного потока");
            }
        }
        return sum;
    }


}
