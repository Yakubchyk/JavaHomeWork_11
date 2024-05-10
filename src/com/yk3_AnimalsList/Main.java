package com.yk3_AnimalsList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalCollection animalCollection = new AnimalCollection();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите названия животных через пробел: ");
        String data = scanner.nextLine();
        String[] list = data.split(" ");
        for (String item : list) {
            animalCollection.addAnimal(item);
        }
        System.out.println("Коллекция LinkedList: " + animalCollection.getAnimals());
        System.out.println();
        while (true) {
            System.out.println("\nМеню:\n" +
                    "1. Состояние коллекции\n" +
                    "2. Добавить\n" +
                    "3. Удалить\n" +
                    "4. Выход\n" +
                    "Выберите действие: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // Очистка символа новой строки

            switch (menu) {
                case 1:
                    System.out.print("1. Состояние коллекции: ");
                    System.out.println(animalCollection.getAnimals());
                    break;
                case 2:
                    System.out.print("2. Какое животное вы хотите добавить: ");
                    String add = scanner.nextLine();
                    animalCollection.addAnimal(add);
                    break;

                case 3:
                    System.out.print("3. Удаляем животное: ");
                    System.out.println(animalCollection.removeAnimal());
                    break;

                case 4:
                    System.out.println("До свидания!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите существующий пункт меню.");
            }
        }
    }
}

/*
Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам:
добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
объекта этого класса в main методе другого класса.
 */