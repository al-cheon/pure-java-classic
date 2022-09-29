package main.practice.part2.io$4;

import main.practice.part2.io$4.dto.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 커스텀 시리얼라이즈 read
 */
public class IOTest04 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("emp.ser");
        ObjectInputStream in = new ObjectInputStream(fis);

        try (in) {
            Employee emp = (Employee) in.readObject();
            System.out.println(emp);
        }


    }
}
