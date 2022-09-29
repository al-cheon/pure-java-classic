package main.practice.part2.io$5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class NIOTest07 {
    public static void main(String[] args) throws IOException {

        Path sample = Paths.get("sample.txt");
        BufferedWriter out = Files.newBufferedWriter(sample, StandardOpenOption.APPEND);

        Scanner scanner = new Scanner(System.in);

        try (scanner; out) {
            System.out.print("입력 :: ");
            out.write(scanner.nextLine());
            out.newLine();
        }

        BufferedReader in = Files.newBufferedReader(sample);
        in.lines().forEach(System.out::println);

    }
}
