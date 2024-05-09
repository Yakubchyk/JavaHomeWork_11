package com.yk3_List;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строчные данные через пробел: ");
        String data = scanner.nextLine();
        String[] list = data.split(" ");
        System.out.println("Массив: " + Arrays.toString(list));
        ArrayList<String> dataList = new ArrayList<>();
        for (String item : list) {
            dataList.add(item);
        }
        System.out.println("Коллекция ArrayList: " + dataList);
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(dataList);
        treeSet.stream().sorted();
        System.out.println("Коллекция после фильтрации: " + treeSet);
        System.out.println("Остаются только уникальные отсортированные данные.");


    }
}

/*
Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
При решении использовать коллекции.

 */
