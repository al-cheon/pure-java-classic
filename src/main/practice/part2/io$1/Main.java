package main.practice.part2.io$1;

/**
 * 이것저것 간단히 테스트
 */
public class Main {
    public static void main(String... args) {
        System.out.println(System.getProperty("java.class.path"));

        /* Class path를 여러 줄로 나누어 확인 가능 (Windows)*/
        for (String el : System.getProperty("java.class.path").split(";")) {
            System.out.println(el);
        }

        /* Class path를 여러 줄로 나누어 확인 가능 (Linux)*/
        for (String el : System.getProperty("java.class.path").split(":")) {
            System.out.println(el);
        }
    }
}
