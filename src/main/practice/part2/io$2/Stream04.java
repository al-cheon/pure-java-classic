package main.practice.part2.io$2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * (Stream03 에 이어서)
 * 스트림 추가 (io 스트림 말고) reader.lines() 사용
 */
public class Stream04 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            reader.lines().forEach(System.out::println);
        } catch (IOException e) {
        }


    }
}
