package main.practice.part2.io$5;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

/**
 * 앞에서 배운 FileFilter 보다 간결하게 이용할 수 있는 메소드
 * Files.list
 * Files.walk
 * Files.find
 * Files.newDirectoryStream
 */
public class NIOTest08 {
    public static void main(String[] args) throws IOException {

        Path base = Paths.get(".");
        Files.list(base) // Files.list :: 경로 바로 아래만 표시
                .forEach(System.out::println);

        System.out.println("========");
        Files.walk(base.resolve("src")) // Files.walk :: 재귀적으로 하위 디렉토리까지 표시
                .forEach(System.out::println);
        System.out.println("========");

        BiPredicate<Path, BasicFileAttributes> bp = (p, attr) -> {
            return p.toFile().getName().endsWith(".jpg");
        };
        Files.find(base, 3, bp) // Files.list :: 특정 조건만 시보리코미
                .forEach(System.out::println);

        System.out.println("::::::::::::::::::::::::::::");
        // Files.newDirectoryStream :: Files.list 와 비슷함
        DirectoryStream<Path> dirs = Files.newDirectoryStream(base);
        for (Path p : dirs) {
            System.out.println(p.getFileName());
        }

    }
}
