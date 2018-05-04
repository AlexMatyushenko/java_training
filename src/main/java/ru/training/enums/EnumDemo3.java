package ru.training.enums;

//Использование конструктора, переменной экземпляра и метода перечисления
enum Transport2 {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    // типичная скорость транспортного средства
    private int speed;

    // конструктор
    Transport2(int s) {
        speed = s;
    }

    //метод
    int getSpeed() {
        return speed;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Transport2 tp;

        //Отобразить скорость самолета
        System.out.println("Типичная скорость самолета: " + Transport2.AIRPLANE.getSpeed() + " миль в час\n");

        //Отобразить все виды транспорта и скорости их движения
        System.out.println("Типичные скорости движения транспортных средств");
        for (Transport2 t : Transport2.values()) {
            System.out.println(t + ": " + t.getSpeed() + " миль в час");
        }
    }
}
