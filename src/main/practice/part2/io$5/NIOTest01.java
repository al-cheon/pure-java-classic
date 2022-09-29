package main.practice.part2.io$5;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Path, File
 */
public class NIOTest01 {
    public static void main(String[] args) {

        Path path1 = Paths.get("dir", "sample.txt");
        Path path2 = Paths.get("dir/sample.txt");

        System.out.println(path1);
        System.out.println(path2);

        Path path3 = new File("sample.txt").toPath();
        System.out.println(path2);
        Path path4 = path3.toAbsolutePath();
        System.out.println(path4);

        File file = path3.toFile();
    }
}
