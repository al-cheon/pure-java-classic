package main.practice.part2.io$5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 두개 차이
 * Files.createDirectories() :: 파일이 이미 존재해도 Exception 발생안함
 * Files.createDirectory() :: 파일이 이미 존재하면 FileAlreadyExistsException 발생 함
 */
public class NIOTest03 {
    public static void main(String[] args) throws IOException {

        Path dir = Paths.get("dir", "subdir");
        if (Files.exists(dir) == false) {
            Files.createDirectories(dir);
            Files.createDirectory(dir);
        }
        Path a = Paths.get("data.txt");
        Files.createFile(dir.resolve(a));

        // 이런식으로 붙일 수도 있다
        Path file = Paths.get("dir", "subdir", "data.txt");

    }
}
