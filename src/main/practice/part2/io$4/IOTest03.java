package main.practice.part2.io$4;

import main.practice.part2.io$4.dto.Employee;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 커스텀 시리얼라이즈 write
 */
public class IOTest03 {
    public static void main(String[] args) throws Exception{

        FileOutputStream fos = new FileOutputStream("emp.ser");
        ObjectOutputStream out = new ObjectOutputStream(fos);

        try (out) {
            Employee emp = new Employee("sample", "08012311231");
            out.writeObject(emp);
        }

    }
}
