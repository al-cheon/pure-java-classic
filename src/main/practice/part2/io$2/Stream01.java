package main.practice.part2.io$2;

import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader 사용 예
 * classpath 에 놓인 sample.txt 파일을 입력스트림 사용
 */
public class Stream01 {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;

        try {
            reader = new FileReader("sample.txt");
            int i = 0;

            while ((i = reader.read()) != -1) {
                char c = (char) i;
                System.out.print(c);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

    }
}
