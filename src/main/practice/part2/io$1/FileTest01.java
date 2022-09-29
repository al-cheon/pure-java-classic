package main.practice.part2.io$1;

import java.io.File;
import java.io.IOException;

/**
 * 파일 존재하는지 확인, 없으면 생성
 */
public class FileTest01 {
    public static void main(String[] args) {

        File file = new File("data.txt");
        try {
            if (file.exists() == false) {
                file.createNewFile(); //파일생성
            }
            System.out.println(file.getAbsolutePath());
        } catch (IOException e) {}


    }
}
