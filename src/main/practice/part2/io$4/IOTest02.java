package main.practice.part2.io$4;

import main.practice.part2.io$4.dto.Item;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Deserialization
 */
public class IOTest02 {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("sample.ser");
        ObjectInputStream in = new ObjectInputStream(fis);

        try (in) {
            Object obj = in.readObject();
            Item item = (Item) obj;
            System.out.println(item);
        }


    }
}
