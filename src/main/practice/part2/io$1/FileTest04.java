package main.practice.part2.io$1;

import java.io.File;

/**
 * (FileTest03 에 이어서)
 * 재귀함수로 하위 디렉토리 내용까지 출력
 */
public class FileTest04 {
    public static void main(String[] args) {
        File rootDir = new File(".");
        showTree(rootDir, "");
    }

    private static void showTree(File dir, String indent) {
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(indent + file.getName());
            if (file.isDirectory()) {
                showTree(file, indent + " ");
            }
        }
    }
}
