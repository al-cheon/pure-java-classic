package main.practice.part2.io$5;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Files.walkFileTree 는 지정한 디렉토리내에서 재귀적으로 돌면서 다음 4가지의 타이밍에 처리한다
 * 1. 디렉토리에 들어갈때
 * 2. 디렉토리에서 나올때
 * 3. 파일을 만났을때
 * 4. 파일의 처리에 실패했을때
 */
public class NIOTest09 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("dir", "data");
        if (Files.exists(dir) == false) {
            Files.createDirectories(dir);
        }

        Files.createFile(dir.resolve(Paths.get("a.txt")));
        Files.createFile(dir.resolve(Paths.get("b.txt")));
        Files.createFile(dir.resolve(Paths.get("c.txt")));

        Files.list(dir).forEach(System.out::println);

        Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }
        });

        Files.delete(dir);
        System.out.println("deleted");
    }
}
