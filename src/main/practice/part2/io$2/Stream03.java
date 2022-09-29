package main.practice.part2.io$2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * (Stream02 에 이어서)
 * BufferedReader 사용
 */
public class Stream03 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("sample.txt");
        BufferedReader reader = new BufferedReader(fr);
        try (reader) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
