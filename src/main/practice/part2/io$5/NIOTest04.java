package main.practice.part2.io$5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * File copy/move
 */
public class NIOTest04 {
    public static void main(String[] args) throws IOException {
        Path sample = Paths.get("dir", "sample.txt");
        if (Files.exists(sample) == false) {
            Files.createFile(sample);
        }

        Path outFile = Paths.get("dir", "sample_bk.txt");
        Files.copy(sample, outFile);

        Path dir = Paths.get("dir", "subdir");
        Path dest = dir.resolve(Paths.get("sample.txt"));
        Files.move(sample, dest);

    }
}
