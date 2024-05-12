package com.yk4_Generic;

public class Main {
    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        stringStorage.setIt("Hello W!");
        System.out.println(stringStorage.getIt());
        System.out.println("Количество символов строки: " + stringStorage.getIt().length());

        Storage<Integer> integerStorage = new Storage<>();
        integerStorage.setIt(9999);
        System.out.println("Число: " + integerStorage.getIt());



    }
}

/*
Задача 4:
Создать дженерик класс Storage с полем того типа который передаем в дженерик при
создании объекта. Сделать конструктор по дефолту и конструктор с этим полем.
Добавить геттеры/сеттеры. В методе main создать 2 объекта на основе этого дженерика и
проверить их работу.
 */
