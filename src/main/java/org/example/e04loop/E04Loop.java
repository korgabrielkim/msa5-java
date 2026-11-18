package org.example.e04loop;

public class E04Loop {
    public static void main(String[] args) {
//        for (초기값; 조건; 증감연산)
//            for (int i = 0; i < 5; i++) {
//                System.out.println(i);
//            }// 0 1 2 3 4
//
//        for (int i = 0; i < 2; i++) {
//            System.out.println(i);
//            for (int j = 0; j < 5; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        // 0 01234 1 01234
        // 구구단 2~9단을 출력
        // 예시)
        // ** 2단 **
        // 2 X 1 = 2
        // 2 X 2 = 4
        // ...
        // ** 3단 **
        // 3 X 1 = 3
        // 3 X 2 = 6
        // ...
        // 9 X 8 = 72
        // 9 X 9 = 81
        for (int i = 2; i < 10; i++) {
            System.out.printf("**%d단**%n", i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }
    }
}