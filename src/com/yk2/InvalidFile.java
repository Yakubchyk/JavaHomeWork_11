package com.yk2;

public class InvalidFile {
    public static boolean isValidDocumentNumber(String line) {
        return line.matches("^(docnum|contract)[a-zA-Z0-9]{15}");
    }
}
