package main.practice.part2.io$3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * InputStreamReader 사용 예
 */
public class Stream002 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();
            System.out.println(input);
        }

    }
}
