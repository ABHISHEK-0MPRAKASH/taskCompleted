package com.java.exceptions.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
    public static void main(String[] args) throws IOException {
        String filename = "nonexistentfile.txt"; // This file does not exist

            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
    }
}
