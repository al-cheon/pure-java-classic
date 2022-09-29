package main.practice.part2.io$2;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 새로운사실!!
 * .close() 를 하지 않으면 파일은 만들어지는데 내용이 안생긴다.
 * 스트림이 열려있는 상태이기에 닫아주어야 내용이 모아지는듯
 *
 * FileWriter 생성자 인수로 true/false 비교
 */
public class Stream05 {
    public static void main(String[] args) throws Exception{
        FileWriter out = new FileWriter("output.txt", true);
        try (out){
            out.write("\n");
            out.write("Hello Java!");
        }
    }
}
