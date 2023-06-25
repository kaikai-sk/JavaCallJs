package com.example.demo.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileIOUtils {
    public static String getFileContentAsString(String filePath) {
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
