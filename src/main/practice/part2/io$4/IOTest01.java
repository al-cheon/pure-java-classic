package main.practice.part2.io$4;

import main.practice.part2.io$4.dto.Item;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Serializable
 */
public class IOTest01 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("sample.ser");
        ObjectOutputStream out = new ObjectOutputStream(fos);
        try (out) {
            Item item = new Item("apple", 100);
            out.writeObject(item);
        }

    }
}
