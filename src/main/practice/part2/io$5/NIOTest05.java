package main.practice.part2.io$5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOTest05 {
    public static void main(String[] args) throws IOException {

        Path sample = Paths.get("sample.txt");
        // 파일 읽기
        BufferedReader br = Files.newBufferedReader(sample);
        try (br) {
            br.lines().forEach(System.out::println);
        }
        //파일 쓰기
        BufferedWriter out = Files.newBufferedWriter(sample);
        try (out) {
            out.write("!!!!!!");
            out.newLine();
        }
    }
}
