package com.yk1.romeo_julietta;

import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        File fileRead = new File("src/com/yk1/romeo_julietta/romeo-and-juliet.txt");
        try (FileReader fr = new FileReader(fileRead)) {
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

            File fileWrit = new File("src/com/yk1/romeo_julietta/longword.txt");
            FileWriter fw = new FileWriter(fileWrit);
            String content = longWord;
            fw.write(Arrays.toString(content.getBytes()));
            fw.close();
            System.out.println("Самое длинное слово в файле: " + longWord);

        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}