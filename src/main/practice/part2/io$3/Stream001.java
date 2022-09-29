package main.practice.part2.io$3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 바이트 스트림 시작!
 * sample.jpg 카피
 */
public class Stream001 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("sample.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("sample_bk.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        try (bis; bos) {
            byte[] data = null;
            while ((data = bis.readNBytes(1024)).length != 0) {
                bos.write(data);
            }
            bos.flush();
        }

    }
}
