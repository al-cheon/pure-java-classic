package main.practice.part2.io$1;

import java.io.File;

/**
 * File :: listFiles() 예
 */
public class FileTest03 {
    public static void main(String[] args) {
        File rootDir = new File(".");
        showTree(rootDir);
    }

    private static void showTree(File dir) {
        for (File file : dir.listFiles()) {
            System.out.println(file.getName());
        }

    }
}
