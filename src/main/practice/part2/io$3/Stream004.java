package main.practice.part2.io$3;

import java.io.Console;

/**
 * (Stream003에 이어서)
 */
public class Stream004 {
    public static void main(String[] args) {
        Console console = System.console();
        char[] password = console.readPassword();
        System.out.println(String.valueOf(password));
    }

    /*실행*/
    //java Stream004.java
}
