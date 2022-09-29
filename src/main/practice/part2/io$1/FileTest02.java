package main.practice.part2.io$1;

import java.io.File;

/**
 * 디렉토리 존재하는지, 없으면 생성
 */
public class FileTest02 {
    public static void main(String[] args) {
        File dir = new File("test");
        if (dir.exists() == false) {
            dir.mkdir();
        }

    }
}
