package main.practice.part2.io$2;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * (Stream05에 이어서)
 * FileWriter/BufferedWriter 사용 예
 */
public class Stream06 {
    public static void main(String[] args) throws Exception{

        FileWriter out = new FileWriter("output.txt", true);
        BufferedWriter writer = new BufferedWriter(out);
        try (writer) {
            writer.newLine(); //개행
            writer.write("buffering output");
            writer.flush(); //버퍼와 파일을 동기화
        }
    }
}
