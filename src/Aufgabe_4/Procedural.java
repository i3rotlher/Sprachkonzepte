package Aufgabe_4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.LinkedList;
import java.util.List;

public final class Procedural {
    private Procedural() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Files.newBufferedReader(Paths.get("C:\\Users\\skill\\Desktop\\Sprachkonzepte\\src\\Aufgabe_4\\TestFile.txt"));
        var lines = new LinkedList<String>();

        long start = System.nanoTime();

        int n = input.lines().filter(s -> s.length() != 0).filter(s -> s.length() > MIN_LENGTH).mapToInt(String::length).sum();
//        readLines(input, lines);
//        removeEmptyLines(lines);
//        removeShortLines(lines);

//        int n = totalLineLengths(lines);
        long stop = System.nanoTime();
        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

    private static void readLines(BufferedReader input, List<String> lines) throws IOException {
        String line;
        while ((line = input.readLine()) != null) {
            lines.add(line);
        }
    }

    private static void removeEmptyLines(List<String> lines) {
        List<String> copy = new LinkedList<>(lines);
        for(String s : copy) {
            if(s.isEmpty()) {
                lines.remove(s);
            }
        }
    }

    private static void removeShortLines(List<String> lines) {
        List<String> copy = new LinkedList<>(lines);
        for(String s : copy) {
            if(s.length() < MIN_LENGTH) {
                lines.remove(s);
            }
        }
    }

    private static int totalLineLengths(List<String> lines) {
        int total = 0;
        for (String s : lines) {
            total = total + s.length();
        }
        return total;
    }
}