package ru.vsu.sc.uliyanov_n_s.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class ListUtils {
    public static List<String> readListFromFile(String fileName) throws FileNotFoundException {
        List<String> lines;
        try (Scanner scanner = new Scanner(new File(fileName), "UTF-8")) {
            lines = new ArrayList<>();
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
        }
        return lines;
    }

    public static void printListInConsole(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(" ");
        }
    }

    public static void writeListToFile(String fileName, List<String> list) {
        try (PrintWriter out = new PrintWriter(fileName)) {
            for (int i = 0; i < list.size(); i++) {
                out.print(list.get(i));
                out.print(" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}