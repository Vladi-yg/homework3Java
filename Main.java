package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }
    static void doDemoWithBufferedReader() {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File("/Users/Владислав/IdeaProjects/Hm3/src/com/company/loadLines.txt")))) {
            String val;
            while ((val = br.readLine()) != null) {
                lines.add(val);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = lines.size() - 2; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
    }
}
