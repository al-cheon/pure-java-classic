package main.practice.part2.io$3;

import java.io.Console;

/**
 * (Stream002에 이어서)
 * Console 사용 예
 * 콘솔에 입력받아서 출력
 */
public class Stream003 {
    public static void main(String[] args) {
        Console console = System.console();
        String input = console.readLine();
        System.out.println(input);
    }
    /*실행*/
    //java Stream003.java
}
