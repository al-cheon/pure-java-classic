package main.practice.part2.io$2;

import java.io.FileReader;

/**
 * (Stream01 에 이어서)
 * Stream01을 try-with-resources 로 만들기
 */
public class Stream02 {
    public static void main(String[] args) throws Exception{

        try(FileReader reader = new FileReader("sample.txt")) {
            int i = 0;
            while ((i = reader.read()) != -1) {
                char c = (char) i;
                System.out.print(c);
            }
        }

    }
}
