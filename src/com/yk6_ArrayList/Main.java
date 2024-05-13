package com.yk6_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);

        customArrayList.delete(2);
        System.out.println(customArrayList);
        customArrayList.add(2, 567);
        System.out.println(customArrayList);
        customArrayList.setList(3, 1000);
        System.out.println(customArrayList);
        customArrayList.add(1500);

        System.out.println(customArrayList);

        customArrayList.delete(2);
        customArrayList.clear();

        System.out.println(customArrayList);

    }
}

/*
Задача *:
Представим, что в Java нет коллекции типа ArrayList. Создать свой класс, симулирующий
работу класса динамической коллекции - т.е. создать свою кастомную коллекцию. В
основе коллекции будет массив. Кастомная коллекция должна хранить элементы разных
классов(т.е. это generic).
Предусмотреть операции(методы):
1. добавления элемента
2. удаления элемента
3. получение элемента по индексу
4. проверка есть ли элемент в коллекции
5. очистка всей коллекции
Предусмотреть конструктор без параметров - создает массив размером
по умолчанию. Предусмотреть конструктор с задаваемым размером внутреннего
массива. Предусмотреть возможность автоматического расширения коллекции при
добавлении элемента в том случае, когда коллекция уже заполнена.
 */