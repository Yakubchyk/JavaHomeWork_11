package com.yk2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите полный путь к файлу: ");
        File inputFile = new File(scanner.nextLine());

        try (FileReader fileReader = new FileReader(inputFile)) {
            FileWriter fileWriter = new FileWriter("src/com/yk2/report.txt");

            StringBuilder line = new StringBuilder();
            int i;
            while ((i = fileReader.read()) != -1) {
                line.append((char) i);
            }
            if (InvalidFile.isValidDocumentNumber(line.toString())) {
                fileWriter.write(line + " - Номер документа соответствует.\n");
            } else {
                fileWriter.write(line + " - Номер документа не соответствует. \n");
            }

            fileWriter.close();

            System.out.println("Завершено. Результаты записаны в файл: report.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

