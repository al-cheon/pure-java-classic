package main.practice.part2.io$3;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Scanner 사용 예
 * 문자스트림을 간단히 취급할 수 있게 해주는 클래스
 */
public class Stream005 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("sample.txt");
        Scanner scanner = new Scanner(fis);
        try (scanner) {
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }
    }
}
