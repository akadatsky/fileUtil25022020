package com.company;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        writeToFile();
        readFromFile();
    }

    private static void readFromFile() {
        try {
            File f = new File("test.txt");
            String s = FileUtils.readFileToString(f, "UTF-8");
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile() {
        try {
            File file = new File("test.txt");
            FileUtils.writeStringToFile(file, "asdf asdf asdf", "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
