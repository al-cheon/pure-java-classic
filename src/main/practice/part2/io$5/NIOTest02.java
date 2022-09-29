package main.practice.part2.io$5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NIOTest02 {
    public static void main(String[] args) throws Exception {
        System.out.print(">");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Path path = Paths.get("dir", name);
        if (Files.exists(path) == false) {
            Files.createFile(path);
        }

        System.out.println(path.toAbsolutePath());

        System.out.println(Files.getLastModifiedTime(path));
//        System.out.println(Files.getPosixFilePermissions(path));

        System.out.print("delete y/n? >");
        if ("y".equals(scanner.nextLine())) {
            Files.deleteIfExists(path);
            System.out.println("deleted");
        }
    }
}

