package com.yk2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile = new File(scanner.nextLine());
        try (FileReader fileReader = new FileReader(inputFile)) {
            StringBuilder line = new StringBuilder();
            int i;
            while ((i = fileReader.read()) != -1) {
                line.append((char) i);
            }
            System.out.println(line);

            File fileWrit = new File("src/com/yk2/report.txt");
            FileWriter fileWriter = new FileWriter(fileWrit);

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}

/*
Допустим есть txt файл с номерами документов. Номером документа является строка,
состоящая из букв и цифр(без служебных символов). Пусть этот файл содержит каждый
номер документа с новой строки и в строке никакой другой информации, только номер
документа. Валидный номер документа должен иметь длину 15 символов и начинаться с
последовательности docnum(далее любая последовательность букв/цифр) или
contract(далее любая последовательность букв/цифр).

Написать программу для чтения информации из входного файла - путь к входному файлу должен задаваться через
консоль. Программа должна проверять номера документов на валидность.
Валидные номера документов следует записать в один файл-отчет. Невалидные номера документов
следует записать в другой файл-отчет, но после номеров документов следует добавить
информацию о том, почему этот документ не валиден.
 */
