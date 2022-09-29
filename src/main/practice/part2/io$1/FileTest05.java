package main.practice.part2.io$1;

import java.io.File;
import java.io.FileFilter;

/**
 * (FileTest04 에 이어서)
 * FileFilter 사용예
 */
public class FileTest05 {
    public static void main(String[] args) {

        File rootDir = new File(".");

        FileFilter filter = (path) -> {
            if (path.isDirectory()) {
                return true;
            }
            if (path.getName().endsWith(".java")) {
                return true;
            }
            return false;
        };

        showTree(rootDir, filter, "");
    }

    private static void showTree(File dir, FileFilter filter, String indent) {
        File[] files = dir.listFiles(filter);
        for (File file : files) {
            System.out.println(indent + file.getName());
            if (file.isDirectory()) {
                showTree(file, filter, indent + " ");
            }
        }
    }
}
