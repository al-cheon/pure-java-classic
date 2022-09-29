package main.practice.part2.io$3;

import main.practice.part2.io$3.dto.PostalCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * (Stream005에 이어서) 자바골드 p.265
 * todo 잘안되네
 *
 */
public class Stream006 {
    public static void main(String[] args) throws Exception {
        List<PostalCode> list = creadteList("hokaido.csv");
        list.forEach(System.out::println);
    }

    private static List<PostalCode> creadteList(String file) throws FileNotFoundException {
        List<PostalCode> list = new ArrayList<>();
        FileInputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis);
        scanner.useDelimiter(", |\n");

        try (scanner) {
            while (scanner.hasNext()) {
                scanner.next();
                scanner.next();
                String code = scanner.next().replaceAll("\\\\", "");
                scanner.next();
                scanner.next();
                String pref = scanner.next().replaceAll("\\\\", "");
                String dist = scanner.next().replaceAll("\\\\", "");
                String town = scanner.next().replaceAll("\\\\", "");

                list.add(new PostalCode(code, pref, dist, town));
            }
        }

        return list;
    }


}
