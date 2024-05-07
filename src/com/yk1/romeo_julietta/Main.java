package com.yk1.romeo_julietta;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/com/yk1/romeo_julietta/romeo-and-juliet.txt";

        try (FileReader fr = new FileReader(inputFileName)) {
            StringBuilder line = new StringBuilder();
            String longWord = "";
            int i;
            while ((i = fr.read()) != -1) {
                char ch = (char) i;
                line.append(ch);
            }
            String[] words = line.toString().split("\\s+");
            for (String w : words) {
                String clWord = w.replaceAll("[^a-zA-Z]", "");
                if (clWord.length() > longWord.length()) { //
                    longWord = clWord;
                }
            }

            File file = new File("src/com/yk1/romeo_julietta/longword.txt");
            FileOutputStream fos = new FileOutputStream(file);
            String content = longWord;
            fos.write(content.getBytes());
            fos.close();
            System.out.println("Самое длинное слово в файле: " + longWord);

        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}